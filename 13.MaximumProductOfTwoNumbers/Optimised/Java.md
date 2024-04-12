```java
class Solution {
    int maxProduct(int arr[], int n) {
        // code here
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i]>max2){
                max2 = arr[i];
            }
        }
        return max1 * max2;
    }
}
```

- here above in else if part `else if(arr[i]>n2 && arr[i]!=n1)` is not required because if elements are repeated their max product can be taken for repeat even though they are equal
- example

```
n=3;
arr = 10 5 10 ;
here largest  is 10 and second largest is 5
but max product is 100 which is 10*10
```
