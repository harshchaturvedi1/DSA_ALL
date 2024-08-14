/*
Finds the minimum element in the unsorted portion of the list and swaps it with the first element. Repeats this process until the entire list is sorted

Time Complexity:
    Best: O(n^2) 
    Average: O(n^2)
    Worst: O(n^2)
    
Space Complexity: O(1) (in-place)
*/



class HelloWorld {
    public static void main(String[] args) {
        
        int[] arr = {10,9,8,7,6};
        
        int n = arr.length;
        selectionSort(arr,n);
        
        for(int i=0;i<n;i++){
            System.out.println(i + "=>" + arr[i]);
        }
    }
    
    public static void selectionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                swap(arr,i,minIndex);
            }
        }
        return;
    }
    
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}