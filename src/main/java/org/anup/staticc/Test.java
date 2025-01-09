package main.java.org.anup.staticc;

interface A{
    static void sayHello(){
        System.out.println("Hello from A");
    }

}

interface B extends A{

}

public class Test implements A,B{
    public static void main(String[] args) {
//      Test obj = new Test();
//      obj.sayHello(); // gives CompileTime Error as we have to access with interface Name

        A.sayHello();
//        B.sayHello(); // gives CompileTime Error as B interface doesn't has the sayHello()


    }
}
