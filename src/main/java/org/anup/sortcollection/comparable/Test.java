package main.java.org.anup.sortcollection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));
        al.add(new Student(100,"Dravid",27));

        Collections.sort(al);

//        for (Student st : al)
//            System.out.println(st.rollno+ " "+ st.name + " "+ st.age);

        al.forEach(student -> System.out.println(student.getName() + ": " + student.getAge()));
    }
}
