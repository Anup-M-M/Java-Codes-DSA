package main.java.org.anup.number;

public class LargestNumber{
    public static void main(String[] args) {

        int num1=12, num2=12, num3=11, largest, temp;

//        temp = num1 > num2 ? num1 : num2;
//        largest = temp > num3 ? temp : num3;

//        largest = num3 > (num1>num2 ? num1 : num2) ? num3 : (num1>num2 ? num1 : num2);

//        System.out.println("The largest number is : "+largest);

        if(num1>=num2 && num1>=num3)
            System.out.println(num1+" is the largest Number");
        else if (num2>=num1 && num2>=num3)
            System.out.println(num2+" is the largest Number");
        else
            System.out.println(num3+" is the largest number");
    }
}
