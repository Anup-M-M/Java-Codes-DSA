package main.java.org.anup.excepton;

class InsufficientFund extends Exception{

    public  InsufficientFund(String message){
        super(message);
    }
}
class BankAccont{

    double balance;

    public BankAccont(double amount){
        this.balance = amount;
    }

    public void withDrawAmmount(double amount) throws Exception {
        if(amount > balance){
            throw new InsufficientFund("Insufficient ammount");
        }
        balance -= amount;
    }
}


public class CustomExceptionEx {
    public static void main(String[] args) {
        BankAccont accont = new BankAccont(10000);
        try{
            accont.withDrawAmmount(200000);
        }catch (Exception e){
            System.out.println(e.getMessage()); // When you print the exception object e, it calls the toString() method of the exception class.
                        //The name of the exception class and The message associated with the exception (if available).
           // System.out.println(e.getMessage()); // This method returns only the message associated with the exception, without the exception class name or stack trace.
           // e.printStackTrace();  // This method prints the complete stack trace of the exception to the console or a log.
        }
    }
}
