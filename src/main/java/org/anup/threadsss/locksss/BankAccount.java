package main.java.org.anup.threadsss.locksss;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int ammount){
       // lock.tryLock() : Acquires the lock if it is available and returns immediately with the value true. If the lock is not available then this method will return immediately with the value false.
       // lock.tryLock(1000, TimeUnit.MILLISECONDS) : Acquires the lock if it is free within the given waiting time. if the waiting time elapsed before the lock was acquired then return false.
       // lock.lock() : if lock is available Acquires the lock. If the lock is not available then the current thread becomes disabled for thread scheduling purposes and lies dormant until the lock has been acquired.
       // lock.lockInterruptibly() : If the lock is available, the thread acquires it immediately and continues execution
                //If the lock is not available: The thread will wait in line to acquire the lock, During this waiting period,
                //if another thread interrupts this thread (by calling thread.interrupt()), then: The wait is terminated immediately
                //An InterruptedException is thrown The thread does not acquire the lock.
        try {
            if(lock.tryLock(3000, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+ ammount);
                if(balance >= ammount) {
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal ");
                    try {
                        Thread.sleep(1000);
                        balance -= ammount;
                        System.out.println(Thread.currentThread().getName() + " complted withdrawal. remaining ammount "+ balance);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock(); // Releases the lock.
                    }
                }else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient funds ");
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " couldn't acquire lock, try again ");
            }
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
    }

    public int getBalance(){
        return balance;
    }
}
