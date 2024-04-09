
class Node {
    int data;
    Node next;

    // Constructor to initialize a node with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkdeList {

    private Node head;

    // Constructor to initialize an empty linked list
    public LinkdeList() {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void displayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}

public class Demo {
    public static void main(String[] args) {
        LinkdeList ll1 = new LinkdeList();
        ll1.insertAtBeginning(1);
        ll1.insertAtBeginning(2);
        ll1.insertAtBeginning(3);
        ll1.insertAtEnd(4);
        ll1.insertAtEnd(5);
        ll1.displayLL();

    }
}