// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Deque dq = new Deque();

        // Adding elements to the deque
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addFirst(0);  // Add at the front
        dq.addFirst(-1); // Add at the front
        dq.addFirst(5); // Add at the front

        // Checking if the deque is empty or full
        System.out.println("empty => " + dq.isEmpty());

        // Removing elements from the deque
        System.out.println("Removing from front => " + dq.removeFirst());
        System.out.println("Removing from rear => " + dq.removeLast());
        System.out.println("Removing from front => " + dq.removeFirst());
        System.out.println("Removing from rear => " + dq.removeLast());

        // Adding more elements to the deque
        dq.addLast(4);
        dq.addLast(5);
        dq.addFirst(-2);
        dq.addFirst(-3);

        // Removing remaining elements
        System.out.println("Removing from front => " + dq.removeFirst());
        System.out.println("Removing from rear => " + dq.removeLast());
        System.out.println("Removing from front => " + dq.removeFirst());
        System.out.println("Removing from rear => " + dq.removeLast());
    
    }
    
}


class Node{
    int data;
    Node prev;
    Node next;
    
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


//Deque linkedlist
class Deque{
    Node front;
    Node rear;
    
    Deque(){
        front = null;
        rear = null;
    }
    
    public boolean isEmpty(){
        return front == null;
    }
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        
        if(isEmpty()){
            front = rear = newNode;
        }else{
           front.prev = newNode;
           newNode.next = front;
           front = newNode;
        }
        
        System.out.println("added in front => " + data);
    }
    
    public int removeFirst(){
        if(isEmpty()){
            System.out.println("queue is empty , nothing to remove");
            return -1;
        }
        
        int res = front.data;
        
        if(front==rear){
            front = rear = null;
        }else{
            front = front.next;
            front.prev = null;
        }
        return res;
    }
    
    public void addLast(int data){

        Node newNode = new Node(data);
        
        if(isEmpty()){
            front = rear = newNode;
        }else{
           newNode.prev = rear;
           rear.next = newNode;
           rear = newNode;
        }
        System.out.println("added in last => " + data);
        
        
    }
    
    public int removeLast(){
        if(isEmpty()){
            System.out.println("queue is empty , nothing to remove");
            return -1;
        }
        
        int res = rear.data;
        
        if(front==rear){
            front = rear = null;
        }else{
            rear = rear.prev;
            rear.next = null;
        }
        return res;
    }
    
    public int peekFirst(){
        if(isEmpty()){
            System.out.println("queue is empty , nothing to peek");
            return -1;
        }
        return front.data;
    }
    
    public int peekLast(){
        if(isEmpty()){
            System.out.println("queue is empty , nothing to peek");
            return -1;
        }
        return rear.data;
        
    }
}