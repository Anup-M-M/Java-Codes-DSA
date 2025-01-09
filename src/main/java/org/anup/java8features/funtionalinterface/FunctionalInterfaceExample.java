package main.java.org.anup.java8features.funtionalinterface;

@FunctionalInterface
interface B{
    void show();
}

//class C implements B{
//
//    @Override
//    public void show() {
//        System.out.println("in show");
//    }
//}



public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        B obj = new B() {
            @Override
            public void show() {
                System.out.println("in show");
            }

        };
        obj.show();
    }
}