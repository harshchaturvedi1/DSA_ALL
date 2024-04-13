- Time Complexity: O(n + m) for counting frequencies in a1 and a2 and O(m) for comparing frequencies.
- Space Complexity: O(n + m) for storing frequencies of elements in um and um2.

```java

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {

    HashMap<Long, Integer> map1 = new HashMap<>();

// creating unordered map of first array
    for(int i=0;i<n;i++){
        if(map1.containsKey(a1[i])){
            int prev = map1.get(a1[i]);
            map1.put(a1[i], prev+1);
        } else {
            map1.put(a1[i],1);
        }

    }
    // checkign second array values  in map of first array
    for(int i=0;i<m;i++){
        if(map1.containsKey(a2[i])){
            int prev = map1.get(a2[i]);
            if(prev==1) map1.remove(a2[i]);
            else
            map1.put(a1[i], prev-1);
        } else {
            return "No";
        }

    }

    return "Yes";



    }
}
```
