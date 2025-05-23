package main.java.org.anup.hashmap.modifyHM;

import java.util.*;

//The key's hashCode() changes when marks is modified.
//HashMap still stores the old key at the old hash location, but lookup is now happening with a new hash.
class Student1 {
    int id;
    String name;
    int marks; // Marks are not included in hashCode()

    public Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, marks); // Marks are INCLUDED
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.id == other.id && this.name.equals(other.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class HashMapCustomKeyExample1 {
    public static void main(String[] args) {
        HashMap<Student1, String> map = new HashMap<>();
        Student1 student = new Student1(101, "Anand", 85);
        map.put(student, "Bangalore");

        // Update marks (Database change)
        student.marks = 95; // Modification after insertion

        // Try to retrieve key
        System.out.println(map.get(student)); // ❌ Returns null

        System.out.println(map); // output : {Student1{id=101, name='Anand', marks=95}=Bangalore}
    }
}

