import java.util.Scanner;
public class Lab_10_58{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList li = new LinkedList();
		int data=0;
		while(true){
			System.out.print("Enter data : ");
			data = sc.nextInt();
			if(data==-1)break;
			li.addNode(data);
		}
		System.out.print("Total number of nodes = "+li.getCount());
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
	Node first = null;
	int count=0;
	public void addNode(int data){
		Node newNode = new Node(data);
			Node last = first;
		if(first == null){
			first = newNode;
			last = first;
		}
		else{
			Node temp = first;
			while(temp.link!=last.link){
				temp = temp.link;
			}
			temp.link = newNode;
		}
		count++;
	}
	public int getCount(){
		return count;
	}
}