
import java.util.Stack;

public class QueueUsingStack{
    public static void main(String[] args){
        NewQueue q1 = new NewQueue();
        q1.add(1);
        System.out.println("top => " + q1.peek());
        System.out.println("isempty ?  => " + q1.isEmpty());
        System.out.println("removed =>" + q1.remove());
           
    }
}

class NewQueue{
    Stack<Integer> s1;
    Stack<Integer> s2;
    
    NewQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public boolean isEmpty(){
        return s1.isEmpty();
    }
    
    public void add(int data){
        if(s1.isEmpty()){
            s1.push(data);
        }else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
               s1.push(s2.pop()); 
            }
        }
    }
    
    public int remove(){
        if(s1.isEmpty()){
            System.out.println("queue is empty ");
            return -1;
        }
        return s1.pop();
    }
    
    public int peek(){
        if(s1.isEmpty()){
            System.out.println("queue is empty ");
            return -1;
        }
        return s1.peek();
    }
    
}