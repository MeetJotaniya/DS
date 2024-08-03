import java.util.*;

     class Queue{
    int n = 10;
    public int[] arr = new int[n];
    int front=-1,rear=-1;

    //Enqueue
    public void Enqueue(int value){
        //overflow
        if(rear == n-1){
            System.out.println("overflow");
        }
        else{
            if(front==-1){
                front++;
            }
            arr[++rear]=value;
            System.out.println(value+"value enqueued");
        }
    }
    //Dequeue
    public void Dequeue(){
        //Underflow
        if(front == -1 || front>rear){
            System.out.println("underflow");
        }
        else{
            int dequeuevalue = arr[front++];
            System.out.println(dequeuevalue+"value dequeued");
        }
    }
    //Display
    public void display(){
        //empty
        if(front==-1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Elements in the Queue: ");
            for(int i = front; i <= rear; i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
    public class Lab_9_50{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Queue queue = new Queue();
            int choice;
        
            do{
                System.out.println("\nQueue operations: ");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Display");
                System.out.println("4. Exit");
                System.out.println("Enter Your Choice : ");
                choice = sc.nextInt();

                switch (choice) {
                    
                    case 1:
                        System.out.println("Enter value to enqueue");
                        int value = sc.nextInt();
                        queue.Enqueue(value);
                        break;
                    case 2:
                        queue.Dequeue();
                        break;
                    case 3:
                        queue.display();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                        default:
                        System.out.println("Invalid choice. Please ReEnter Your Choice.");
                
            }
        }
            while(choice!=4);
            sc.close();
        
    }
}

