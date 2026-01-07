import java.util.*;

public class maphash{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter length of array...");
        int n=sc.nextInt();
        int arr[]=new int[n];
        Ssystem.out.println("Enter elemnt of array...");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    //precompute
    Map<Integer, Integer> mpp = new HashMap<>();

for (int i = 0; i < n; i++) {
    mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
}

        int q=sc.nextInt();
        while(q-- >0){
            int number=sc.nextInt();
            
            //fetch
            System.out.println(mpp[number]);
        }

    }
}