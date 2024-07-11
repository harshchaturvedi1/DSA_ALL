class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        int current = stack.peek();
        System.out.println("current=> " + current);

        stack.push(4);
        int current2 = stack.peek();
        System.out.println("current=> " + current2);

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        int current3 = stack.peek();
        System.out.println("current=> " + current3);

        boolean isFull = stack.isFull();
        System.out.println("is stack full => " + isFull);

        stack.push(9);

        int valueRemoved = stack.pop();
        System.out.println("value removed => " + valueRemoved);

        stack.push(9);
        
        int current4 = stack.peek();
        System.out.println("current=> " + current4);

    }
}
