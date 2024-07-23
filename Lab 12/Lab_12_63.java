import java.util.Scanner;

public class Lab_12_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        int data = 0;
        
        while (true) {
            System.out.print("Enter data: ");
            data = sc.nextInt();
            if (data == -1) break;
            l1.addNode(data);
        }
        
        copy(l1, l2);
        l2.display();
    }
    
    public static void copy(LinkedList l1, LinkedList l2) {
        Node temp = l1.first;
        while (temp != null) {
            l2.addNode(temp.data);
            temp = temp.link;
        }
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
    
    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }
}