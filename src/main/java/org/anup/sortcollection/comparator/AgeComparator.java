package main.java.org.anup.sortcollection.comparator;

import java.util.*;

class AgeComparator implements Comparator<Student>{

//    public int compare(Student s1,Student s2){
//        if(s1.age==s2.age)
//            return 0;
//        else if(s1.age>s2.age)
//            return 1;
//        else
//            return -1;
//    }

//    public int compare(Student s1,Student s2){
//        // Using ternary operator for comparison in descending order
//        return (s1.age < s2.age) ? 1 : (s1.age > s2.age) ? -1 : 0;
//    }

    public int compare(Student s1,Student s2){
        return Integer.compare(s1.age, s2.age);
    }
}
