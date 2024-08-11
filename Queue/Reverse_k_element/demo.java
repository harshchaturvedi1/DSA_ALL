
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        int k = 2;
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        for(int i=0;i<k;i++){
            s.push(q.poll());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        for(int i=0;i<q.size() - k;i++){
            q.add(q.poll());
        }
        
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        
     }
}
// queue , num=k
// 1 2 3 4 5
// k = 2
// 2 1 3 4 5

// queue => 1 2 3 4 5  => 3,4,5 =>  3,4,5,2,1 => 2,1,3,4,5
// stack => 1, 2 => [] => []
