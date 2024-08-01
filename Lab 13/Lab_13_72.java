import java.util.Scanner;

public class Lab_13_72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       myDoublyLinkedlist doublyLinkedlist=new myDoublyLinkedlist();
       doublyLinkedlist.insertAtEnd(5);
       doublyLinkedlist.insertAtEnd(6);
       doublyLinkedlist.insertAtEnd(7);
       doublyLinkedlist.insertAtEnd(8);
       System.out.println(doublyLinkedlist.countOfNodes());;
    //    doublyLinkedlist.insertAtFront(4);
        System.out.println("og Doubly Linked-list: ");
        doublyLinkedlist.display();
        do
        {
            System.out.println("Which operation do you want to perfrom in above Doubly Linkedlist ?");
            System.out.println("1. Insert at front");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete at given position");
            System.out.println("4. Display");
            int opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                {
                    System.out.println("Enter the element to be inserted at front: ");
                    int element=sc.nextInt();
                    doublyLinkedlist.insertAtFront(element);
                    System.out.println("Doubly Linked-list after insertion at first: ");
                    doublyLinkedlist.display();
                    break;
                    }
                case 2:
                {
                    System.out.println("Enter the element to be inserted at end: ");
                    int element=sc.nextInt();
                    doublyLinkedlist.insertAtEnd(element);
                    System.out.println("Doubly Linked-list after insertion at last: ");
                    doublyLinkedlist.display();
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the position at which you want to delete the element: ");
                    int position=sc.nextInt();
                    doublyLinkedlist.deleteAt(position);
                    System.out.println("Doubly Linked-list after deletion at given position: ");
                    doublyLinkedlist.display();
                    break;
                }
                case 4:
                {
                    System.out.println("Doubly Linked-list: ");
                    doublyLinkedlist.display();
                    break;
                }
                default:
                {
                    System.out.println("Invalid option");
                    break;
                }
            }
                System.out.println("do you want to continue:");
                System.out.println("1. Yes");
                System.out.println("2.No");
                int opt1=sc.nextInt();
                if(opt1==1)
                {
                    continue;
                }
                else
                {
                    break;
                }
        }while (true); 
        sc.close();
    }
    
}

class Node
{
    int info;
    Node lptr;
    Node rptr;
    Node(int info)
    {
        this.info=info;
        this.lptr=null;
        this.rptr=null;
    }
}

class myDoublyLinkedlist{
    Node head=null;
    Node tail=null;
    public void  insertAtFront(int info){
        Node temp=new Node(info);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }
        head.lptr=temp;
        temp.rptr=head;
        head=temp;
    }
    public void insertAtEnd(int info){
        Node temp=new Node(info);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }
        tail.rptr=temp;
        temp.lptr=tail;
        tail=temp;
    }
    public void deleteAt(int index){
        if(index < 0 || index > countOfNodes() - 1){
            System.out.println("Invalid index !");
            return;
        }
        if(index == 0){
            head = head.rptr;
            head.lptr=null;
            return;
        }
        Node temp = head;
        Node save = head;
        int i = 0;
        while(i < index){
            save = temp;
            temp = temp.rptr;
            i++;
        }
        if(temp.rptr == null){
            save.rptr=null;
            tail = save;
        } else {
            save.rptr = temp.rptr;
            temp.rptr.lptr = save;
        }
    }
    public void display(){
        Node temp=head;
        while(temp !=null){
            if(temp==tail){
                System.out.println(temp.info);
                break;
            }
            System.out.print(temp.info+"->");
            temp=temp.rptr;
        }
    }
    public int countOfNodes(){
        Node temp=head;
        int count=0;
        while(temp !=null){
            count++;
            temp=temp.rptr;
        }
        return count;
    }

}