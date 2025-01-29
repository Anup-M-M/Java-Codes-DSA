package main.java.org.anup.threadsss.locksss;

public class Test {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(25);
            }
        };

        Thread t1 = new Thread(task,"t1");
        Thread t2 = new Thread(task,"t2");

        t1.start();
        t2.start();
    }
}
