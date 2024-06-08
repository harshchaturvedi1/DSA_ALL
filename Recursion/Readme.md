# Recursion Documentation

## Introduction

Recursion is a programming technique where a method calls itself in order to solve smaller instances of the same problem. It's a powerful concept commonly used in algorithm design and programming.

## How Recursion Works

At its core, recursion involves breaking down a problem into smaller, more manageable subproblems, and then solving each subproblem recursively until a base case is reached. The base case is the condition under which the method stops calling itself and returns a value, thus preventing infinite recursion.

Here's a typical structure of a recursive method in Java:

```java
public class RecursionExample {

    public static ReturnType recursiveMethod(Parameters parameters) {
        // Base case
        if (baseCaseCondition) {
            return baseCaseValue;
        }

        // Recursive case
        else {
            // Modify parameters for the next recursive call if needed
            modifiedParameters = ...

            // Make the recursive call
            return recursiveMethod(modifiedParameters);
        }
    }
}
```

## Example

- Consider the classic example of computing the factorial of a number using recursion:

```java
public class FactorialExample {

    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: factorial of n is n times factorial of (n-1)
        else {
            return n * factorial(n-1);
        }
    }
}
```

## Advantages and Disadvantages

### Advantages

- Concise and elegant solution for certain types of problems
- Can simplify the implementation of complex algorithms

### Disadvantages

- Can be less efficient in terms of memory usage and execution time compared to iterative solutions
- May lead to stack overflow errors if not implemented properly with a base case and proper termination condition
