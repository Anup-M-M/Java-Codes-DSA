package main.java.org.anup.java8features.lambda.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> al=new ArrayList<>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));
        al.add(new Student(100,"Dravid",27));

       // Without Lambda expression
       // Collections.sort(al, new MyClass());

        Collections.sort(al, (s1, s2) -> Integer.compare(s1.age, s2.age));

       // Collections.sort(al, (s1, s2) -> s1.rollno - s2.rollno);

/*        Collections.sort(al, (s1,s2) -> {
            if(s1.age==s2.age)
                return 0;
            else if(s1.age>s2.age)
                return 1;
            else
                return -1;
        });*/



        System.out.println(al);
    }
}
