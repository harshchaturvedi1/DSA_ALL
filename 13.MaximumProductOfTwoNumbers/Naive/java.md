- time complexity - O(n^2)
- auxiliary space - O(1)

```java
class Solution {
    int maxProduct(int arr[], int n) {
        // code here
        int maximum = 0;
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j=i+1;j<n;j++){
                if(arr[i]*arr[j]>max){
                    max = arr[i]*arr[j];
                }
            }
            if(max>maximum){
                maximum = max;
            }

        }
        return maximum;
    }
}
```
