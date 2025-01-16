package main.java.org.anup.java8features.lambda.sorting;

import java.util.Comparator;

public class MyClass implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        //return Integer.compare(s1.age, s2.age);

        return s1.name.compareToIgnoreCase(s2.name);

       /* if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;*/
    }
}
