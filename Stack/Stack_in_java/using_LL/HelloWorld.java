class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    private Node top;

    public Stack(){
        top = null;
    }

    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;

    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return (top == null);
    }
}


class HelloWorld{
    public static void main(String[] args){
        Stack stack = new Stack();

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

        stack.push(9);

        int valueRemoved = stack.pop();
        System.out.println("value removed => " + valueRemoved);

        stack.push(9);
        
        int current4 = stack.peek();
        System.out.println("current=> " + current4);
    }
}