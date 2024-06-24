import java.util.Scanner;
public class Lab_4_22{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		System.out.print("Enter number you want to delete : ");
		int num = sc.nextInt();
		int[] prev = new int[n];
		int[] next = new int[n-1]; 
		for(int i=0;i<n;i++){
			System.out.println("Enter value of arr["+i+"] : ");
			prev[i] = sc.nextInt();
		}
		int j=0;
		for(int i=0;i<next.length;i++,j++){
			if(num == prev[i]){
				next[i]=prev[j+1];
			}
			else{
				next[i] = prev[j];
			}
		}
		System.out.println("After deletion : ");
		for(int i=0;i<next.length;i++){
			System.out.println("Value of arr["+i+"] : "+next[i]);
		}
	}
}