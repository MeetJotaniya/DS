import java.util.Scanner;
public class Lab_10_59{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		int data = 0;
		System.out.println("Enter data for LinkedList 1 : ");
		while(true){
			System.out.print("Enter data : ");
			data = sc.nextInt();
			if(data==-1)break;
			l1.addNode(data);
		}
		System.out.println("Enter data for LinkedList 2 : ");
		while(true){
			System.out.print("Enter data : ");
			data = sc.nextInt();
			if(data==-1)break;
			l2.addNode(data);
		}
		if(l1.isEqual(l2)){
			System.out.println("Both LinkedLists are equal");
		}
		else{
			System.out.println("Both LinkedLists are unequal");
		}
	}
}
class Node{
	int data;
	Node link;
	public Node(int data){
		this.data=data;
		this.link = null;
	}
}
class LinkedList{
	Node first;
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
	public boolean isEqual(LinkedList l2){
		Node n1 = this.first;
		Node n2 = l2.first;
		while(n1!=null && n2!=null){
			if(n1.data != n2.data){
				return false;
			}
			n1 = n1.link;
			n2 = n2.link;
		}
		return n1==null && n2==null;

	}
}