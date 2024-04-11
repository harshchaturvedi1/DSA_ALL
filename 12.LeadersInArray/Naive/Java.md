- time complexity - O(n^2)
- Auxiliary space - O(1)

```java

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        // arrList.add(5);
        // int n = arr.length;
        for(int i=0;i<n;i++){

            int max = arr[i];
            boolean found = false;

            for(int j=i;j<n;j++){

                if(arr[j]>max){
                    found = true;
                    break;
                }

            }

            if(!found)
            arrList.add(arr[i]);

        }

        return arrList;
    }
}
```
