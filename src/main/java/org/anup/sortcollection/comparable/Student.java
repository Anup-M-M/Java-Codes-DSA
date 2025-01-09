package main.java.org.anup.sortcollection.comparable;

public class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    public Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public int compareTo(Student other) {
//        if(this.age == other.age) return 0;
//        else if (this.age > other.age) return 1;
//        else return -1;
//    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.age, this.age);
    }

}
