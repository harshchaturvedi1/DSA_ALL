// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Deque dq = new Deque(5);

        // Adding elements to the deque
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addFirst(0);  // Add at the front
        dq.addFirst(-1); // Add at the front
        dq.addFirst(5); // Add at the front

        // Checking if the deque is empty or full
        System.out.println("empty => " + dq.isEmpty());
        System.out.println("full => " + dq.isFull());

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


// circular deque
class Deque{
    int[] arr;
    int size;
    int front = -1;
    int rear = -1;
    
    Deque(int size){
        this.size = size;
        this.arr = new int[size];
    }
    
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    
    public boolean isFull(){
        return (rear+1) % size == front;
    }
    
    public void addFirst(int data){
        if(isFull()){
            System.out.println("queue is full cannot add => " + data);
            return;
        }
        
        if(front==-1){
            front = 0;
            rear = 0;
        }else{
            front = (front - 1 + size) % size ;
        }
        arr[front] = data;
        System.out.println("added in front => " + data);
    }
    
    public int removeFirst(){
        if(isEmpty()){
            System.out.println("queue is empty , nothing to remove");
            return -1;
        }
        
        int res = arr[front];
        
        if(front==rear){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1) % size;
        }
        return res;
    }
    
    public void addLast(int data){
        if(isFull()){
            System.out.println("queue is full cannot add => " + data);
            return;
        }
        
        if(front==-1){
            front = 0;
            rear = 0;
        }else{
            rear = (rear + 1) % size;
        }
        arr[rear] = data;
        System.out.println("added in last => " + data);
        
        
    }
    
    public int removeLast(){
        if(isEmpty()){
            System.out.println("queue is empty , nothing to remove");
            return -1;
        }
        
        int res = arr[rear];
        
        if(front==rear){
            front = -1;
            rear = -1;
        }else{
            rear = (rear - 1 + size) % size;
        }
        return res;
    }
    
    public int peekFirst(){
        if(isEmpty()){
            System.out.println("queue is empty , nothing to peek");
            return -1;
        }
        return arr[front];
    }
    
    public int peekLast(){
        if(isEmpty()){
            System.out.println("queue is empty , nothing to peek");
            return -1;
        }
        return arr[rear];
        
    }
}