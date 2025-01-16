package main.java.org.anup.dsa.searchingalgorithms.que;

class FindMinSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,1,1,2};
       // int minElement = findMinV1(arr);
        int minElement = findMinV2(arr);
        System.out.println(minElement);
    }

    private static int findMinV2(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right ){
            int mid = (left+right)/2;

            //If mid element is smaller than its previous element, it must be the minimum
            if(mid > 0 && arr[mid] < arr[mid-1]){
                return arr[mid];
            }

            //Determine which side to serch left or right
            // If the middle element is greater than the rightmost element,
            // it means the array is rotated and minimum element lies in right half
            if (arr[mid] > arr[right]) {
                // The minimum must be in the right half
                left = mid + 1;
            } else {
                // If middle element is less than or equal to rightmost element,
                // minimum could be the mid element itself or lies in left half
                right = mid;
            }
        }
        return arr[left];
    }

    private static int findMinV1(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right ){
            int mid = (left+right)/2;
            //Determine which side to serch left or right
            // if Mid Element is Greater than Right Element the smallest element must be in the right half
            // because the left part (including mid) is sorted but greater than the smallest element.
            if (arr[mid] > arr[right]) {
                // The minimum must be in the right half
                left = mid + 1;
            } else {
                //Mid Element is Less than or Equal to Right Element then
                //the smallest element could be mid itself or in the left half.
                right = mid;
            }
        }
        return arr[left];
    }
}
