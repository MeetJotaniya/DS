import java.util.Scanner;

public class Lab_11_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(); 
        int data = 0;
        String s = "";
        while (!s.equals("-1")) {
            System.out.println("Press 1 for push : ");
            System.out.println("Press 2 for pop : ");
            System.out.println("Press 3 for peep : ");
            System.out.println("Press 4 for change : ");
            System.out.println("Press 5 for display : ");
            System.out.println("Press -1 to exit : ");
            s = sc.next();
            switch (s) {
                case "1":
                    System.out.println("Enter value to push : ");
                    data = sc.nextInt();
                    st.push(data);
                    break;
                case "2":
                    int poppedValue = st.pop();
                    if (poppedValue == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println("Pop = " + poppedValue);
                    }
                    break;
                case "3":
                    System.out.print("Enter index from top : ");
                    int index = sc.nextInt();
                    int peepValue = st.peep(index);
                    if (peepValue == -1) {
                        System.out.println("Stack Underflow or Invalid Index");
                    } else {
                        System.out.println("Peep = " + peepValue);
                    }
                    break;
                case "4":
                    System.out.print("Enter index from top : ");
                    index = sc.nextInt();
                    System.out.print("Enter value you want to change : ");
                    data = sc.nextInt();
                    boolean changed = st.change(data, index);
                    if (!changed) {
                        System.out.println("Stack Underflow or Invalid Index");
                    }
                    break;
                case "5":
                    st.display();
                    break;
                case "-1":
                    System.out.println("Exiting the loop");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
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

class Stack {
    Node first = null;

    public void push(int data) {
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

    public int pop() {
        if (first == null) {
            return -1;
        }
        if (first.link == null) {
            int data = first.data;
            first = null;
            return data;
        } else {
            Node temp = first;
            while (temp.link.link != null) {
                temp = temp.link;
            }
            int data = temp.link.data;
            temp.link = null;
            return data;
        }
    }

    public int peep(int index) {
        if (first == null) {
            return -1;
        } else {
            Node temp = first;
            Node current = first;
            int count = 0;
            while (temp.link != null) {
                temp = temp.link;
                count++;
            }
            if (count - index < 0) {
                return -1;
            } else {
                int i = 0;
                while (current != null) {
                    if (count - index == i) {
                        return current.data;
                    }
                    current = current.link;
                    i++;
                }
                return -1;
            }
        }
    }

    public boolean change(int data, int index) {
        if (first == null) {
            return false;
        } else {
            Node temp = first;
            Node current = first;
            int count = 0;
            while (temp.link != null) {
                temp = temp.link;
                count++;
            }
            if (count - index < 0) {
                return false;
            } else {
                int i = 0;
                while (current != null) {
                    if (count - index == i) {
                        current.data = data;
                        return true;
                    }
                    current = current.link;
                    i++;
                }
                return false;
            }
        }
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