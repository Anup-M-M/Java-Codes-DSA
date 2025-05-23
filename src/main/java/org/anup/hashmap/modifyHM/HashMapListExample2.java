package main.java.org.anup.hashmap.modifyHM;

import java.util.*;

//we retrieve the list using get(K), then modify it, the changes reflect in the map because lists are mutable.
//Instead of replacing, we can modify the existing list to retain the old values.
public class HashMapListExample2 {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();

        // Adding initial list
        map.put("Java", new ArrayList<>(Arrays.asList("Spring", "Hibernate")));

        System.out.println("Before Update: " + map);

        // Updating the existing list instead of replacing
        map.get("Java").add("JSP");

        System.out.println("After Adding JSP: " + map);
    }
}

