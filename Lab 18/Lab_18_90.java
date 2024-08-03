import java.util.*;
public class Lab_18_90{
    public static void main(String[] args) {
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            System.out.println("enter element at["+i+"]");
            arr[i] = sc.nextInt();
        }  
        System.out.println("Enter value that you want to find... = ");
        key = sc.nextInt();
        int i;
        for(i=0;i<=arr.length;i++){
            if(key == arr[i]){
                System.out.println("Value at index "+i);
                break;
            }
        }
         if(i>=arr.length)   
        System.out.println("number not found");
        sc.close();
        }
    }
