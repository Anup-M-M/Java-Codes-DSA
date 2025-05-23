package main.java.org.anup.hashmap.modifyHM;

import java.util.*;

//For immutable keys like String or Integer, updating the variable reference does not affect the HashMap.
public class ImmutableKeyExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        String key = "Java";
        map.put(key, "Spring");

        // Change the reference (not the key in HashMap)
        key = "Python";

        System.out.println(map); // Output: {Java=Spring}

        //=====================

        map.put(key, "Spring");
        System.out.println(map); // Output: {Java=Spring, Python=Spring}
    }
}

