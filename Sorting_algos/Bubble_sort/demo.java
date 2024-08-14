/*
Time Complexity:
    Best: O(n) (when the array is already sorted)
    Average: O(n^2)
    Worst: O(n^2)
Space Complexity: O(1) (in-place)
*/

class HelloWorld {
    public static void main(String[] args) {
        
        int[] arr = {10,9,8,7,6};
        
        bubbleSort(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.println(i + "=>" + arr[i]);
        }
    }
    
    public static void bubbleSort(int[] arr){
        boolean sorted = false;
        int n = arr.length;
        while(!sorted){
            sorted = true;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    sorted = false;
                    swap(arr,i,i+1);
                }
            }
            // reduce bcz every time largest element will go at the end 
            n--;
        }
    }
    
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
