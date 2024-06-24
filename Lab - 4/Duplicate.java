public class Duplicate{
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,5,7,2,3};
        int m = 0;
        int n = arr.length;
        for(int i = 0;i < n - 1;i++){
            for(int j = i + 1;j < n;j++){
                if(arr[i] == arr[j]){
                    m = 0;
                    while(j < n){
                        if(arr[j] == arr[i]){
                            m++;
                        }
                        else{
                            arr[j - m] = arr[j];
                        }
                        j++;
                    }
                    n-=m;
                }
            }
        }

        for(int i = 0;i < n;i++){
            System.out.println(arr[i] + " ");
        }

    }
}