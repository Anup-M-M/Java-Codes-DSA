package main.java.org.anup.hashmap.modifyHM;

import java.util.HashMap;

//If the key already exists, the old value is replaced with the new value, and the method returns the old value.
//The structure of the HashMap (buckets, nodes, tree) remains unchanged unless rehashing is triggered.
public class HashMapUpdateExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("Anand", 100);
        map.put("Java", 200);

        System.out.println("Initial HashMap: " + map);

        // Update value for existing key
        int oldValue = map.put("Anand", 500); // Returns old value

        System.out.println("Updated HashMap: " + map);
        System.out.println("Old Value for 'Anand': " + oldValue);
    }
}
