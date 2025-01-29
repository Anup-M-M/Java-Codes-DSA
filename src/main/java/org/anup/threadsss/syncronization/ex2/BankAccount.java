package main.java.org.anup.threadsss.syncronization.ex2;

public class BankAccount {

    private int balance = 100;

    public synchronized void withdraw(int ammount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+ ammount);
        if(balance >= ammount) {
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal ");
            try {
                Thread.sleep(3000);
                balance -= ammount;
                System.out.println(Thread.currentThread().getName() + " complted withdrawal. remaining ammount "+ balance);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }else {
            System.out.println(Thread.currentThread().getName() + " Insufficient funds ");
        }
    }

    public int getBalance(){
        return balance;
    }
}
