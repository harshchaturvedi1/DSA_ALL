- Time Complexity: O(log(N))
- Auxiliary Space: O(1)

```java
//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> arrIndex = new ArrayList<>();
        // ArrayList<Integer> arr = new ArrayList<>();
        int l=0,h=n-1;
        while(l<=h){
            int mid = l + (h - l) / 2;

            if(arr[mid]==x){
                arrIndex.add(firstOccurance(arr,n,x,mid));
                arrIndex.add(lastOccurance(arr,n,x,mid));
                break;
            }
            else if(arr[mid]>x){
                h = mid-1;
            } else l = mid + 1;

        }

        if (arrIndex.isEmpty())
            arrIndex.add(-1);

        return arrIndex;

    }


    public int firstOccurance(int arr[], int n, int x,int mid){
        while(mid>0 && arr[mid-1]==x){
            mid--;
        }

        return mid;

    }

      public int lastOccurance(int arr[], int n, int x,int mid){
        while(mid<n-1 && arr[mid+1]==x){
            mid++;
        }

        return mid;

    }
}
```
