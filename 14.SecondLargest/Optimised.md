- time complexity - O(n)
- Auxiliary space - O(1)

```java
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int n1 = -1;
        int n2 = -1;

        for(int i=0;i<n;i++){
            if(arr[i]>n1){
                n2 = n1;
                n1 = arr[i];

            }else if(arr[i]>n2 && arr[i]!=n1){
                n2 = arr[i];
            }
        }
        return n2;
    }
}
```
