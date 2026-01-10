import java.util.*;

public class flight_ticket{

    public static void main(String[] args){
        HashMap<String, String> tci=new HashMap<>();
        tci.put("chennai", "Bengaluru");
        tci.put("Mumbai", "Delhi");
        tci.put("Goa","chennai");
        tci.put("Delhi","Goa");

        HashMap<String, String> tci2=new HashMap<>();

        for(String str: tci.keySet() ){
            tci2.put(tci.get(str),str);
        }
        String start=null;
        for(String str: tci.keySet()){
            if(!tci2.containsKey(str)){
                start=str;
                
                break;
            }
        }
         System.out.print(start);
        for(String str: tci.keySet()){
            System.out.print(" -> "+tci.get(start));
            start=tci.get(start);
        }
       
    }
}