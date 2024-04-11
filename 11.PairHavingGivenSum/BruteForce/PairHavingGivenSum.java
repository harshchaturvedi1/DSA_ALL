// brute force approch
// time complexity O(n^2)
// space complexity O(n) 
// Auxiliary Space: O(n)

public class PairHavingGivenSum {

    public int countPairs(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PairHavingGivenSum pair = new PairHavingGivenSum(); // Create an instance
        int[] arr = { 1, 5, 7, -1 };
        int K = 6;

        int count = pair.countPairs(arr, K); // Call the method using the instance

        System.out.println(count);
    }
}

// public class PairHavingGivenSum {

// public static int countPairs(int[] arr, int k) {
// int count = 0;

// for (int i = 0; i < arr.length - 1; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] + arr[j] == k) {
// count++;
// }
// }
// }
// return count;
// }

// public static void main(String[] args) {
// int[] arr = { 1, 5, 7, -1 };
// int K = 6;

// int count = countPairs(arr, K);

// System.out.println(count);

// }

// }