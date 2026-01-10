import java.util.*;
public class pract{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("SIZe of arr");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even=even+arr[i];
            }else{
                odd=odd+arr[i];
            }
        }
        int result=odd-even;
        System.out.println("Substract of odd place and even place is :"+reult);
    }
}