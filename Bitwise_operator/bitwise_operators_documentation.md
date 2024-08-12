
# Bitwise Operators in JavaScript and Java

Bitwise operators are used to perform operations on individual bits of integers. They are often used in low-level programming, such as embedded systems or performance-critical applications. Below are the common bitwise operators available in both JavaScript and Java.

## 1. Bitwise AND (`&`)
- **Operation**: Each bit in the result is `1` if the corresponding bits of both operands are `1`, otherwise `0`.
- **Example in JavaScript**:
  ```javascript
  let a = 5;  // 0101 in binary
  let b = 3;  // 0011 in binary
  let result = a & b; // result is 1 (0001 in binary)
  ```
- **Example in Java**:
  ```java
  int a = 5;  // 0101 in binary
  int b = 3;  // 0011 in binary
  int result = a & b; // result is 1 (0001 in binary)
  ```

## 2. Bitwise OR (`|`)
- **Operation**: Each bit in the result is `1` if at least one of the corresponding bits of the operands is `1`.
- **Example in JavaScript**:
  ```javascript
  let a = 5;  // 0101 in binary
  let b = 3;  // 0011 in binary
  let result = a | b; // result is 7 (0111 in binary)
  ```
- **Example in Java**:
  ```java
  int a = 5;  // 0101 in binary
  int b = 3;  // 0011 in binary
  int result = a | b; // result is 7 (0111 in binary)
  ```

## 3. Bitwise XOR (`^`)
- **Operation**: Each bit in the result is `1` if the corresponding bits of the operands are different.
- **Example in JavaScript**:
  ```javascript
  let a = 5;  // 0101 in binary
  let b = 3;  // 0011 in binary
  let result = a ^ b; // result is 6 (0110 in binary)
  ```
- **Example in Java**:
  ```java
  int a = 5;  // 0101 in binary
  int b = 3;  // 0011 in binary
  int result = a ^ b; // result is 6 (0110 in binary)
  ```

## 4. Bitwise NOT (`~`)
- **Operation**: Inverts all the bits of the operand.
- **Example in JavaScript**:
  ```javascript
  let a = 5;  // 0101 in binary
  let result = ~a; // result is -6 (in two's complement representation)
  ```
- **Example in Java**:
  ```java
  int a = 5;  // 0101 in binary
  int result = ~a; // result is -6 (in two's complement representation)
  ```

## 5. Left Shift (`<<`)
- **Operation**: Shifts the bits of the first operand to the left by the number of positions specified by the second operand. Zeroes are shifted in from the right.
- **Example in JavaScript**:
  ```javascript
  let a = 5;  // 0101 in binary
  let result = a << 1; // result is 10 (1010 in binary)
  ```
- **Example in Java**:
  ```java
  int a = 5;  // 0101 in binary
  int result = a << 1; // result is 10 (1010 in binary)
  ```

## 6. Right Shift (`>>`)
- **Operation**: Shifts the bits of the first operand to the right by the number of positions specified by the second operand. The leftmost bits are filled with the sign bit.
- **Example in JavaScript**:
  ```javascript
  let a = 5;  // 0101 in binary
  let result = a >> 1; // result is 2 (0010 in binary)
  ```
- **Example in Java**:
  ```java
  int a = 5;  // 0101 in binary
  int result = a >> 1; // result is 2 (0010 in binary)
  ```

## 7. Unsigned Right Shift (`>>>`) [JavaScript Only]
- **Operation**: Shifts the bits of the first operand to the right by the number of positions specified by the second operand. Zeroes are shifted in from the left.
- **Example in JavaScript**:
  ```javascript
  let a = -5; // binary: 11111111111111111111111111111011
  let result = a >>> 1; // result is 2147483645 (binary: 01111111111111111111111111111101)
  ```
- **Note**: Java does not have an equivalent operator; use unsigned integers or handle signed integer shifts as necessary.

## 8. Zero Fill Right Shift (`>>>`) [Java Only]
- **Operation**: Similar to the unsigned right shift in JavaScript, but in Java, this operator also shifts zeroes into the leftmost positions for signed integers.
- **Example in Java**:
  ```java
  int a = -5; // binary: 11111111111111111111111111111011
  int result = a >>> 1; // result is 2147483645 (binary: 01111111111111111111111111111101)
  ```

