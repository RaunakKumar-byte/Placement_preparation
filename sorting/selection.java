import java.util.*;

public class selection{
     
     public static void selection_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_index=i;
          
            for(int j=i;j<n;j++){
            if(arr[j]<arr[min_index]){
                min_index=j;
            }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;


            
        }
     }
    public static void main(String[] args){
    int arr[] = {64, 25, 12, 22, 11};

        selection_sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}