package main.java.org.anup.number;

// Prints all the Armstrong numbers up to the specified limit.
public class ArmstrongNumberSeries {
    public static void main(String[] args) {
        int num= 999;
        for (int i = 0; i <= num; i++) {
            if(isArmStrongNumber(i))
                System.out.print(i +" ");
        }
    }

    private static boolean isArmStrongNumber(int i) {
        int digits=0, last = 0, temp = 0, ans = 0;
        temp = i;
        while(temp > 0){
           temp = temp / 10;
           digits ++;
        }

        temp = i;
        while (temp > 0){
            last = temp % 10;
            ans = (int) (ans + Math.pow(last, digits));
            temp = temp / 10;
        }
        return i == ans;
    }
}
