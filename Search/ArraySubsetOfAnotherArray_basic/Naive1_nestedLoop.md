- time complexity - O(m\*n)
- Auxiliary space - O(1)

```java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {

        // second array a2
        for(int i=0;i<m;i++){
            // first array a1
            boolean found = false;
            for(int j=0;j<n;j++){
                if(a1[j]==-1) continue;

                if(a2[i]==a1[j]){
                    found = true;
                    a1[j] = -1;
                    break;
                }
            }

            if(!found){
                return "No";
            }
        }

        return "Yes";


    }
}
```
