# Binary Search in Data Structures and Algorithms

Binary search is a widely used searching algorithm that efficiently locates a target value within a sorted array or list. It works by repeatedly dividing the search interval in half until the target value is found or the interval is empty.

## Algorithm

1. Compare the target value with the middle element of the array.
2. If the target value matches the middle element, return its index.
3. If the target value is greater than the middle element, search the right half of the array.
4. If the target value is less than the middle element, search the left half of the array.
5. Repeat the process recursively or iteratively until the target value is found or the interval is empty.

## Pseudocode

```plaintext
function binarySearch(array, target):
    low = 0
    high = length of array - 1
    while low <= high:
        mid = (low + high) / 2
        if array[mid] equals target:
            return mid
        else if array[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1 (indicating element not found)
```

### Time Complexity

- Binary search has a time complexity of O(log n), where n is the number of elements in the array. This is because the search interval is halved in each iteration, leading to a logarithmic time complexity.

### Space Complexity

- Binary search has a space complexity of O(1), as it requires only a constant amount of extra space for variables like pointers and indices.

### Applications

- Binary search is commonly used in scenarios where efficient searching of sorted arrays or lists is required, such as searching in databases, libraries, or sorted arrays in programming languages.
- It is also used as a building block in various other algorithms and data structures, such as binary search trees and divide-and-conquer algorithms.
- Binary search is a fundamental algorithm in computer science and is widely used due to its efficiency and simplicity.
