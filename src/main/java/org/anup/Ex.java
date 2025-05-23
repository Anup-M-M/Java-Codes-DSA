package main.java.org.anup;

import java.io.FileNotFoundException;
import java.io.IOException;

class ExP{
    public void eat() throws IOException {
        System.out.println("Animal");
    }
}

public class Ex extends ExP{

    @Override
    public void eat()  {
        System.out.println("Dog");
    }

    public void song(){
        System.out.println("Animal");
    }

    public static void main(String[] args) {

        ExP a = new Ex();
        Ex d = new Ex();

        d.eat();
        //a.eat(); Handle exception

    }
}
