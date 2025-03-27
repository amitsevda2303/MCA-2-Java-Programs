// 83.	Write a Java program to implement a linked list.
class Node {
    int data;
    Node next;

    Node(int data) { this.data = data; this.next = null; }
}

class LinkedList {
    private Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    void delete(int key) {
        if (head == null) return;
        if (head.data == key) { head = head.next; return; }
        
        Node temp = head;
        while (temp.next != null && temp.next.data != key) temp = temp.next;

        if (temp.next != null) temp.next = temp.next.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class lp83 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Linked List:");
        list.display();

        list.delete(20);
        System.out.println("After Deletion:");
        list.display();
    }
}
