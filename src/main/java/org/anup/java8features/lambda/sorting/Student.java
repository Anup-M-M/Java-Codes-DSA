package main.java.org.anup.java8features.lambda.sorting;

public class Student{
    int rollno;
    String name;
    int age;

    public Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
