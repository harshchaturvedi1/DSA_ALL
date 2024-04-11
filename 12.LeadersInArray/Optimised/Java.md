- time complexity - O(n)
- auxiliary space - O(n)

```java

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int leader = arr[n-1];
        arrList.add(leader);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>=leader){
                leader = arr[i];
                arrList.add(leader);
                continue;
            }
        }
        Collections.reverse(arrList);

        return arrList;
    }
}
```

### Approch

- go from last element
- print greatest element till now
- this will give all leaders in reverse order
- reverse the result at end
- very imp `if(arr[i]>=leader)`
