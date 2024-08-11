// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        System.out.println("empty==> "+ q1.isEmpty());
        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        System.out.println("empty==> "+ q1.isEmpty());
        // System.out.println("full==> "+ q1.isFull());
        // removing
        System.out.println("removing from queue=> " + q1.deQueue() );
        System.out.println("removing from queue=> " + q1.deQueue() );
        System.out.println("removing from queue=> " + q1.deQueue() );
        System.out.println("removing from queue=> " + q1.deQueue() );
        
        q1.enQueue(5);
        q1.enQueue(6);
        q1.enQueue(7);
        q1.enQueue(8);
        q1.enQueue(9);
          
        System.out.println("removing from queue=> " + q1.deQueue() );
        System.out.println("removing from queue=> " + q1.deQueue() );
        System.out.println("removing from queue=> " + q1.deQueue() );
        System.out.println("removing from queue=> " + q1.deQueue() );
        System.out.println("removing from queue=> " + q1.deQueue() );
        System.out.println("removing from queue=> " + q1.deQueue() );
    }
    
}


class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


// circular queue
class Queue{
    Node head = null;
    Node tail = null;
    
    public boolean isEmpty(){
        return (head == null && tail == null);
    }
    
    public void enQueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        
        System.out.println("added to queue=> "+ data);
    }
    
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        
        int res = head.data;
        if(head==tail){
            tail = null;
        }
        head = head.next;
        return res;
    }
    
    public int peek(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
    
}