package main.java.org.anup.array;

// find the longest sequence of consecutive 1s in an array
public class ConsecutiveOnes {
    public static void main(String[] args) {
        // Array to check for consecutive 1s
        int[] array = {0, 1, 0, 0, 1, 1, 1, 0};

        // Variables to store the maximum count and current count of consecutive 1s
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            }else {
                currentCount=0;
            }
        }
        System.out.println("Max Consecutive Ones : " + maxCount);
    }
}
