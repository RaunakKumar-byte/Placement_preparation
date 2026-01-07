import java.util.*;

public class hashmap{


    public static void main(String[] args){
        HashMap<String, Integer> hm=new HashMap<>();

        // Insert- o(1)
        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("Pakistan", 30);
        hm.put("Us", 20);
        hm.put("Russia",30);

                System.out.println(hm);


        // // //get- o(1)
        // int popul=hm.get("India");
        // System.out.println(popul);

        // // //Containskey - o(1)
        //  System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Pakistan"));


        // //remove -o(1)

        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // //size
        // System.out.println(hm.size());

        // //is empty
        // System.out.println(hm.isEmpty());

        // //hm.clear();





        //iteration on 
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String k: keys){
            System.out.println("key= "+k+",value="+hm.get(k));
        }


    }
}