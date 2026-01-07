import java.util.*;

public class bubble{
     


     public static void bubble_sort(int []arr){
        int n=arr.length;
    
        for(int i=n-1;i>=0;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap=1;
                }

            }
            if(didSwap==0){
                break;
            }
        }
     }

    public static void main(String[] args){
  int arr[] = {5, 1, 4, 2, 8};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}