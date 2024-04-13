```java
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n){
        return findPeak(arr,0,n-1,n);
    }

    public int findPeak(int[] arr, int low, int high, int n){

        int mid = low + ((high-low)/2);

        // if(mid==0){

        //       if(n>1){

        //           if(arr[mid]>=arr[mid+1]) return mid;

        //       }else return mid;

        // }else if(mid==n-1){

        //     if(arr[mid]>=arr[mid-1]) return mid;
        // }

        // -- the above will not work because if it enters into if or else block and than inside it goes false
        // it can't execute next else if block now

        if ((mid == 0 || arr[mid-1] <= arr[mid]) &&(mid == n-1 || arr[mid+1] <= arr[mid]))
			return mid;

        else if(mid>0 && arr[mid-1]>arr[mid])
            return findPeak(arr,low,mid-1,n);

        else return findPeak(arr,mid+1,high,n);


    }
}
```
