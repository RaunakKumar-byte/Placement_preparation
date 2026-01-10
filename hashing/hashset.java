import java.util.*;

public class hashset{

    public static void main(String[] args){
    
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(1);

    set.remove(1);
    if(set.contains(1)){
        System.out.println("it exist");
    }
    System.out.println(set);
        }
}