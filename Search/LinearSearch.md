# Linear Search in Data Structures and Algorithms

Linear search, also known as sequential search, is a basic searching algorithm that sequentially checks each element in a list until a match is found or the end of the list is reached. It is suitable for small lists or unsorted lists where the elements are not in any particular order.

## Algorithm

1. Start from the beginning of the list.
2. Iterate through each element of the list.
3. Compare the current element with the target element.
4. If the current element matches the target element, return its index.
5. If the end of the list is reached without finding the target element, return a value indicating that the element is not found.

## Pseudocode

```plaintext
function linearSearch(list, target):
    for each element in list:
        if element equals target:
            return index of element
    return -1 (indicating element not found)
```

### Types of Linear Search

- <b> Basic Linear Search: </b> Each element of the list is compared sequentially with the target element until a match is found or the end of the list is reached.
- <b> Optimized Linear Search: </b> Improved efficiency by adding a sentinel value at the end of the list, avoiding an explicit comparison with the end of the list inside the loop.

### Advantages

- Simple and easy to understand.
- Works well for small lists or unsorted lists.

### Disadvantages

- Inefficient for large lists or sorted lists.
- Time complexity of O(n), where n is the number of elements in the list.
- Linear search is not the most efficient search algorithm for large or sorted lists, but it can be useful in certain situations, such as searching for an element in an unsorted list or for educational purposes due to its simplicity.
