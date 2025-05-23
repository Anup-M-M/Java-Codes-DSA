package main.java.org.anup.hashmap.modifyHM;

import java.util.*;

public class HashMapListExample1 {
    public static void main(String[] args) {
        // Create a HashMap with List as value
        HashMap<String, List<String>> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Java", new ArrayList<>(Arrays.asList("Spring", "Hibernate")));

        System.out.println("Before Update: " + map);

        // Updating with a new list (replaces the old list)
        List<String> newList = new ArrayList<>(Arrays.asList("JSP", "Servlet"));

        List<String> oldList = map.put("Java", newList);

        System.out.println("After Update: " + map);
        System.out.println("Old List: " + oldList);
    }
}

