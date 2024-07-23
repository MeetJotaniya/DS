class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Lab_12_66 {
    Node head;
  
    void swapKth(int k) {
        if (k < 1 || k > countNodes()) {
            System.out.println("Invalid value of k");
            return;
        }

       
        if (2 * k - 1 == countNodes()) {
            System.out.println("Same nodes, no swap needed");
            return;
        }

  
        Node x = head;
        Node xPrev = null;
        for (int i = 1; i < k; i++) {
            xPrev = x;
            x = x.next;
        }

       
        Node y = head;
        Node yPrev = null;
        for (int i = 1; i < countNodes() - k + 1; i++) {
            yPrev = y;
            y = y.next;
        }

      
        if (xPrev != null) {
            xPrev.next = y;
        } else {
            head = y;
        }

      
        if (yPrev != null) {
            yPrev.next = x;
        } else {
            head = x;
        }


        Node temp = x.next;
        x.next = y.next;
        y.next = temp;
    }


    int countNodes() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            c++;
        }
        return c;
    }

  
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

 
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

       
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original list:");
        list.printList();

        int k = 2; 

        System.out.println("After swapping " + k + "-th nodes from beginning and end:");
        list.swapKth(k);
        list.printList();
    }
}

