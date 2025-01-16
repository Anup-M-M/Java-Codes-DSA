package main.java.org.anup.java8features.lambda.lambdaex;

/*
class SoftwareEngineer implements Employee {
    @Override
    public String getName() {
        return "Software Engineer";
    }
}
*/

public class Main {
    public static void main(String[] args) {
        //Employee employee = new SoftwareEngineer();
        Employee employee = () -> "Software Engineer";
        System.out.println(employee.getName());
    }
}
