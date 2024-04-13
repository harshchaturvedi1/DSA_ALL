- time complexity - O(n\*B)
- Auxiliary space - O(1)

```java
class Solution
{
    boolean check_elements(int arr[], int n, int A, int B)
    {
        int found = 0;

        for(int i=A;i<=B;i++){
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    found++;
                    break;
                }
            }
        }

        if(found==(B-A+1))
            return true;
        else return false;

    }
}
```
