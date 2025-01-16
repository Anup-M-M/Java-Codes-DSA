package main.java.org.anup.java8features.lambda.anonymouex;

/*
class SoftwareEngineer implements Employee {
    @Override
    public String getName() {
        return "Software Engineer";
    }

    @Override
    public int getSalary() {
        return 50000;
    }
}
*/


public class Main {
    public static void main(String[] args) {
        // Use lamda expression for SAM, if multiple abstract methos use anonymous inner class
        Employee employee = new Employee(){
            @Override
            public String getName() {
                return "Software Engineer";
            }

            @Override
            public int getSalary() {
                return 50000;
            }
        };

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
