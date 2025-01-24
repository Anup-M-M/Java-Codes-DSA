package main.java.org.anup.java8features.fi_functionex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Function is FuntionalInterface, takes one argument, perform some operation and prodcuce the output of anytype.
public class Main {

    public static void main(String[] args) {

        Function<String, Integer> function1 = str -> str.length();
        System.out.println(function1.apply("anup"));

        Function<String, String> function2 = str -> str.substring(0,3);

        Function<List<Student>, List<Student>> studentsWithPrefixVIP = li -> {
            List<Student> result = new ArrayList<>();
            for(Student student : li){
                if(function2.apply(student.getName()).equalsIgnoreCase("vip")) {
                    result.add(student);
                }
            }
            return result;
        };

        Student student1 = new Student("anup", 1);
        Student student2 = new Student("vipul", 2);
        Student student3 = new Student("vipuleswar", 3);
        List<Student> students = Arrays.asList(student1,student2,student3);
        List<Student> output = studentsWithPrefixVIP.apply(students);

        System.out.println(output);

    }

    private static class Student {
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
