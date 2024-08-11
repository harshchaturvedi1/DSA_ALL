// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Queue q1 = new Queue(3);
        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        System.out.println("empty==> "+ q1.isEmpty());
        System.out.println("full==> "+ q1.isFull());
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
    }
    
}

// normal queue
class Queue{
    int[] arr;
    int size;
    int rear;
    
    Queue(int size){
        this.size = size;
        this.arr = new int[size];
        this.rear = -1;
    }
    
    public boolean isEmpty(){
        return rear == -1;
    }
    
    public boolean isFull(){
        return rear == size-1;
    }
    
    public void enQueue(int data){
        if(isFull()){
            System.out.println("queue is full cannot add=> " + data);
            return;
        }
        arr[++rear] = data;
    }
    
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }
    
    public int peek(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }
    
}