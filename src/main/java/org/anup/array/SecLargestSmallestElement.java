package main.java.org.anup.array;

public class SecLargestSmallestElement {
    public static void main(String[] args) {
        int arr[] = {25, 11, 7, 56, 75};

        int secLargest = getSecLargestElement(arr);
        int secSmallest = getSecSmallestElement(arr);
        System.out.println(" sec largest : "+ secLargest + " sec smallest : "+ secSmallest);
    }

    private static int getSecLargestElement(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        int secLargestElement = Integer.MIN_VALUE;

        for(int data : arr){
            if(data > largestElement){
                secLargestElement = largestElement;
                largestElement = data;
            }else if( data > secLargestElement && data != largestElement)
                secLargestElement = data;
        }

        return secLargestElement;
    }

    private static int getSecSmallestElement(int[] arr) {
        int smallestElement = Integer.MAX_VALUE;
        int secSmallestElement = Integer.MAX_VALUE;

        for (int data : arr) {
            if (data < smallestElement) {
                secSmallestElement = smallestElement;
                smallestElement = data;
            } else if (data < secSmallestElement && data != smallestElement)
                secSmallestElement = data;
        }
        return secSmallestElement;
    }
}
