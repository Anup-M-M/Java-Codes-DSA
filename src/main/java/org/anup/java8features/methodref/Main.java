package main.java.org.anup.java8features.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anup", "Rashmi", "Arun");
       // names.forEach( str -> System.out.println(str));
        names.forEach(Main::print);

       // List<Student> students = names.stream().map(str -> new Student(str)).collect(Collectors.toList());
        List<Student> students = names.stream().map(Student :: new).collect(Collectors.toList());
        students.forEach( str -> System.out.println(str));
    }

    public static void print(String str){
        System.out.println(str);
    }
}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

