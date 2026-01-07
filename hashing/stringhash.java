import java.util.*;

public class stringhash{



    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter string ...");
    StringBuilder sb=new StringBuilder(sc.nextLine());

    int hash[]=new int[256];
    for(int i=0;i<sb.length();i++){
        hash[sb.charAt(i)]++;
    }



    int q=sc.nextInt();
    while(q-- >0){
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        //fetch
        System.out.println(hash[ch]);
    }
    }
}