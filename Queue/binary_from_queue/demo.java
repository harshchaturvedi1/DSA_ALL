import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        
        // Start with "1" in the queue
        queue.add("1");
        
        for (int i = 1; i <= N; i++) {
            // Dequeue the front element
            String current = queue.poll();
            System.out.println(current); // Print the current binary number
            
            // Generate the next two binary numbers
            String next1 = current + "0";
            String next2 = current + "1";
            
            // Enqueue the new binary numbers
            queue.add(next1);
            queue.add(next2);
        }
    }
    
    public static void main(String[] args) {
        int N = 5;
        generateBinaryNumbers(N);
    }
}
