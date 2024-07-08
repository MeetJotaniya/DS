import java.util.Scanner;
public class Lab_11_62{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter -1 to exit");	
		int data=0;
		LinkedList li = new LinkedList();
		while(true){
			System.out.print("Enter data : ");
			data = sc.nextInt();
			if(data==-1)break;
			li.addNode(data);
		}
		li.removeDuplicates();
		li.display();
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
class LinkedList{
	Node first=null;
	public void addNode(int data){
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
	public void removeDuplicates(){
		if(first == null){
			System.out.println("No nodes available in LinkedList");
		}
		else if(first.link == null){
			if(first.data == first.link.data){
				System.out.println("NULL");
			}
			else{
				System.out.print(first.data+" "+first.link.data);
			}
		}
		Node current = first;

        while (current != null) {
            Node runner = current;
            while (runner.link != null) {
                if (runner.link.data == current.data) {
                    runner.link = runner.link.link;
                } else {
                    runner = runner.link;
                }
            }
            current = current.link;		
	}
	}
	public void display(){
		Node temp = first;
		while(temp!=null){
			System.out.print(" "+temp.data);
			temp = temp.link;
		}
	}
}