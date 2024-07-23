import java.util.Scanner;

public class Lab_12_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList li = new LinkedList();
        System.out.println("Enter -1 to exit");

        int data = 0;
        while (true) {
            System.out.print("Enter data: ");
            data = sc.nextInt();
            if (data == -1) break;
            li.addNode(data);
        }

        System.out.println("Original list:");
        li.display();

        li.reverse();

        System.out.println("Reversed list:");
        li.display();
    }
}

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    Node first = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = first;
        Node next = null;
        while (current != null) {
            next = current.link;
            current.link = prev;
            prev = current;
            current = next;
        }
        first = prev;
    }

    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}