import java.util.Scanner;
public class Lab_7_38{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		System.out.print("Enter size of array : ");
		st.N = sc.nextInt();
		st.S = new int[st.N];
		String s = "";
		while(!(s.equals("-1"))){
		System.out.println("Press 1 for push");
		System.out.println("Press 2 for pop");
		System.out.println("Press 3 for peep");
		System.out.println("Press 4 for change");
		System.out.println("Press 5 for display");
		System.out.println("Press -1 for exit");
		s = sc.next();
		int x,index;
		switch(s){
			case "1":
				System.out.print("Enter the value you want to push : ");
				x = sc.nextInt();
				st.push(x);
				break;
			case "2":
				System.out.println("Value of pop = "+st.pop());
				break;
			case "3":
				System.out.print("Enter index for peep : ");
				index = sc.nextInt();
				System.out.println("Value at index "+index+" = "+st.peep(index));
				break;
			case "4":
				System.out.print("Enter index : ");
				index = sc.nextInt();
				System.out.print("Enter value you want to replace");
				x = sc.nextInt();
				st.change(index,x);
				break;
			case "5":
				st.display();
				break;
			case "-1":
				System.out.print("Exiting from loop");
				break;
			default:
				System.out.println("Invalid input");

			}
		}
		sc.close();

	}
}
class Stack{
	int[] S;
	int TOP=-1;
	int N;
	public void push(int X){
		if(TOP>=N-1){
			System.out.println("Stack Overflow");
			return;
		}
		else{
			TOP=TOP+1;
			S[TOP] = X;
			return;
		}
	}
	public int pop(){
		if(TOP==-1){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			TOP=TOP-1;
			return S[TOP+1];
		}
	}
	public int peep(int index){
		if(TOP-index+1<=0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			return S[TOP-index+1];
		}
	}
	public void change(int index,int x){
		if(TOP-index+1<0){
			System.out.println("Stack Underflow");
			return;
		}
		else{
			S[TOP-index+1] = x;
			return;
		}
	}
	public void display(){
		for(int i=0;i<TOP;i++){
			System.out.println("S["+i+"] : "+S[i]);
		}
	}
}