package main.java.org.anup.hashmap.modifyHM;

import java.util.*;

class Student2 {
    int id;
    String name;
    int marks;

    public Student2(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }
}

public class HashMapCustomValueExample {
    public static void main(String[] args) {
        // Reversed HashMap: String (place) as key, Student as value
        HashMap<String, Student2> map = new HashMap<>();

        // Create a Student object
        Student2 student = new Student2(101, "Anand", 85);

        // Add the entry to HashMap
        map.put("Bangalore", student);

        // Output initial state
        System.out.println("Initial Map: " + map.get("Bangalore"));

        // Update marks in Student object (after some database change)
        student.marks = 95; // Modifying marks in Student object

        // Try to retrieve key using "Bangalore"
        System.out.println("\nUpdated Map (after modifying marks): " + map.get("Bangalore"));

        // Now, let's modify the key reference
        String place = "Bangalore";
        place = "Mysore"; // Changing the key reference

        // Try to retrieve using the old and new keys
        System.out.println("\nRetrieve using original key (Bangalore): " + map.get("Bangalore"));
        System.out.println("Retrieve using new key (Mysore): " + map.get("Mysore"));
    }
}

