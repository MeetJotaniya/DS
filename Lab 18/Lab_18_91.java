import java.util.*;
public class Lab_18_91{
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
        int left=0;
        int right=arr.length-1;
        int mid;
        while(left<=right){
            mid =(left+right)/2; 
            if(arr[mid]==key){
                System.out.println("Value at index "+mid);
                break;  
            }
            else if(arr[mid]>key){
                right = mid - 1 ;
            }
            else{
                left = mid + 1;
            }
        }
            if(left > right){
                System.out.println("Number Not Found.");
            }
        
    }
}
