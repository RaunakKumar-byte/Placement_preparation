import java.util.*;
public class prac2{
  
    public static int factorial(int k){
         int fact = 1;

    while (k >= 1) {
        fact = fact * k;
        k--;
    }

    return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("SIZe of arr");
        int n=sc.nextInt();
     
      System.out.println("Enter elemnt of arr");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            arr[i]=factorial(arr[i]);
        }
        
System.out.println(Arrays.toString(arr));


    }
}