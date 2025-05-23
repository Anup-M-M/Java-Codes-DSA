package main.java.org.anup.hashmap.modifyHM;

import java.util.*;

//marks is not part of hashCode(), modifying it does not affect key retrieval.
//The hashCode() remains the same, so the key is still accessible.
class Student {
    int id;
    String name;
    int marks; // Marks are not included in hashCode()

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name); // Marks are NOT included
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class HashMapCustomKeyExample {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student student = new Student(101, "Anand", 85);
        map.put(student, "Bangalore");

        // Update marks (Database change)
        student.marks = 95; // Modification after insertion

        // Try to retrieve key
        System.out.println(map.get(student)); // ✅ Works: Output -> Bangalore

        System.out.println(map); // {Student{id=101, name='Anand', marks=95}=Bangalore}
    }
}

