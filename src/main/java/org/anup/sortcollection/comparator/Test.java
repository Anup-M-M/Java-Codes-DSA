package main.java.org.anup.sortcollection.comparator;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String args[]) {
        //Creating a list of students
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(105, "Ram", 21));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        //Using NameComparator to sort the elements
        //Collections.sort(al, new AgeComparator());

        // sort using comparator through collections class methos
        //Collections.sort(al, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        // sort using comapartor through list methods
/*        al.sort((s1, s2) -> {
                    if(s1.getAge() == s1.getAge()) return 0;
                    else if (s1.getAge() > s2.getAge())  return 1;
                    else return 0;
        });*/

        Comparator<Student> comparator = Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getName);
        al.sort(comparator);

        //Traversing the elements of list
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println("=================================================");

        //Using AgeComparator to sort the elements
        Collections.sort(al, new NameComparator());

        //Traversing the elements of list
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

    }
}
