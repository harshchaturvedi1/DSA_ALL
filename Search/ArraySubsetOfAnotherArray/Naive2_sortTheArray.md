- Time Complexity: O(n log n + m log m) due to the sorting operations.
- Space Complexity: O(1) - no extra space used apart from the input arrays and a few variables.

```cpp
string isSubset(int a1[], int a2[], int n, int m) {
    std::sort(a1,a1+n);
    std::sort(a2,a2+m);

    int i = 0, j = 0;

    while (i < n && j < m) {
        if (a1[i] < a2[j]) {
            ++i;
        } else if (a1[i] == a2[j]) {
            ++i;
            ++j;
        } else {
            return "No";
        }
    }

    return (j == m) ? "Yes" : "No";
}
```
