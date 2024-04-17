
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 7;
        int x = 8;

        int low = 0, high = n - 1;
        int result = Search(arr, n, x, low, high);
        System.out.println(result);

    }

    public static int Search(int[] arr, int n, int x, int low, int high) {
        if (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;

            else if (arr[mid] > x) {
                return Search(arr, n, x, low, mid - 1);
            }

            else
                return Search(arr, n, x, mid + 1, high);

        } else
            return -1;
    }

}