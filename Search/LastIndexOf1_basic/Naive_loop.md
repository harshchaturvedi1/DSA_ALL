- Time Complexity: O(N)
- Auxiliary Space: O(1)

```java
class Solution {
    public int lastIndex( String s) {
        int n = s.length();
        // System.out.println(n)
        // return n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                return i;
            }
        }

        return -1;

    }
}
```
