package main.java.org.anup.java8features.funtionalinterface;

@FunctionalInterface
interface I{
    void m1();
}

class A{

    int x = 99;
    public void show(){
        int x = 100;
        I i = () -> {
            System.out.println(this.x); // 99
            System.out.println(x); // 100
           //x = 1000; // compileTime Error bcz variable used in lambda expression should be final.
            this.x = 999;
            System.out.println(this.x); // 999
        };
        System.out.println("before m1 calls " + this.x); // 99
        i.m1();
        System.out.println("after m1 calls " + this.x); // 999
    }
}

public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();
    }
}
