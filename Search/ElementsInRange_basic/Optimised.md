- Time Complexity: O(N).
- Auxiliary Space: O(1).

```java
class Solution
{
    boolean check_elements(int arr[], int n, int A, int B)
    {

        		// Iterate through the array
		for (int i = 0; i < n; i++) {
			// Check if the absolute value of the element is within the range
			if ((Math.abs(arr[i])) >= A && (Math.abs(arr[i])) <= B) {
				// Update the value of the element
				int z = Math.abs(arr[i]) - A;
				if (z<n && arr[z] > 0) {
					arr[z] = arr[z] * -1;
				}
			}
		}

        int foundCount = 0;

        for(int i=0;i<n;i++){
            // System.out.print(i+" " + arr[i]);
            if(arr[i]<0) foundCount++;
        }

        if(foundCount==(B-A+1))
            return true;
        else return false;


    }
}
```
