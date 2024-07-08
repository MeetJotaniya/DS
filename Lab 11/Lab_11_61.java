import java.util.Scanner;
public class Lab_11_61{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            Queue q = new Queue();
            int choice=0;
            int data=0;
             
            while(true){
            	System.out.println("Press 1 for enqueue");
            	System.out.println("Press 2 for dequeue");
            	System.out.println("Press 3 for display");
            	System.out.println("Press -1 for exit");
            	choice = sc.nextInt();
            	switch(choice){
            		case 1:
            			System.out.print("Enter data : ");
            			data = sc.nextInt();
            			q.enqueue(data);
            			break;
            		case 2:
            			q.dequeue();
            			break;
            		case 3:
            			q.display();
            			break;
            		case -1:
            			System.out.println("Exiting the loop");
            			return;
            	}
            }
        }
	}
}
class Node{
	int data;
	Node link;
	public Node(int data){
		this.data = data;
		this.link = null;
	}
}
class Queue{
	Node first = null;
	public void enqueue(int data){
		Node newNode = new Node(data);
		if(first == null){
			first = newNode;
		}
		else{
			Node temp = first;
			while(temp.link!=null){
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	public void dequeue(){
		if(first == null){
			System.out.println("Queue is empty");
		}
		else{
			first = first.link;
		}
	}
	public void display(){
		Node temp = first;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.link;
		}
		System.out.println();
	}
}