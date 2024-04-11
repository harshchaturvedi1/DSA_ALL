/*
 * using set in java won't work because of elements is repeatig 
 * we won't get count of all
 */

/*
 * using hashing
 * we can gt all count  
 * time complexity - O(n) 
 * space complexity - O(n) - to create hashset
*/
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int countPair(int[] arr, int K) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int counterPart = K - num;
            if (map.containsKey(counterPart)) {
                count += map.get(counterPart);
            }
            if (map.containsKey(num)) {
                int prevVal = map.get(num);
                map.put(num, prevVal + 1);
            } else {
                map.put(num, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 5, 7, -1 };
        // int K = 6;
        int[] arr = { 1, 1, 1, 1 };
        int K = 2;

        int count = countPair(arr, K);
        System.out.println(count);

    }

}
