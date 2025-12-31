



public class polymor{
    //  public static void funcnt(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
        
    //     funcnt(n-1);

    //  }
    //  public static void backtrack(int i, int n){
    //     if(i<1){
    //         return;
    //     }
    //     backtrack(i-1,n);
    //     System.out.println(i);
    //  }
     public static void backtrack2(int i, int n){
        if(i>n){
            return;
        }
        backtrack2(i+1,n);
        System.out.println(i);
     }
     public static int sum_n_number(int n){
        
        if(n==0){
            return 0;
        }
        return n+sum_n_number(n-1);
     }
     public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
     }
    public static void main(String[] args){
        // funcnt(5);
        // backtrack(5,5);
        backtrack2(1,3);
        System.out.println(factorial(5));
    }
}