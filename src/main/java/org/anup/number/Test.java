package main.java.org.anup.number;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String > map = new HashMap<>();
        map.put(25, "Anup");
        map.put(24, "Rash");
        map.put(15, "kusu");


       for(Map.Entry<Integer,String> entry : map.entrySet()){
           if(entry.getKey() < 18)
               System.out.println(entry.getValue());
       }

       String s = "apple apple";
       Set<String> set = new LinkedHashSet<>();
       set.add(s);
       System.out.println(set);
    }
}
