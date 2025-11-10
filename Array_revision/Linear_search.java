import java.util.*;
public class Linear_search{

  public static int linear_ser(int key, int arr[]){
    for(int i=0;i<arr.length;i++){
       if(arr[i]==key){
        return i;
       }
    }            
    return -1;                         
  }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int key=sc.nextInt();

     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int index=linear_ser(key,arr);
     System.out.println(index);
    }
}