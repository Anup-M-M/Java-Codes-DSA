package main.java.org.anup.array;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2,2,3,6,6,6,2,2,8,2,2};

      //  int ans = majorityElement(arr);

        int ans = majorityElementByMoores(arr);

        System.out.println("The majority element is: " +ans);
    }

    // Moore’s Voting Algorithm: This algorithm works on the fact that if an element occurs more than N/2 times, it means that the remaining elements other than this would definitely be less than N/2.
    // First, choose a candidate from the given set of elements if element is the same as the candidate element, increase the votes.
            // Otherwise, decrease the votes if votes become 0, select another new element as the new candidate.
    //Time Complexity : O(n)
    //Space Complexity : O(1)
    private static int majorityElementByMoores(int[] arr) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == candidate)
                count++;
            else
                count--;

            if(count == 0){
                candidate = arr[i];
                count = 1;
            }
        }
        count = 0;
        for(int val : arr){
            if(val == candidate)
                count ++;
        }

        if (count > arr.length /2 )
            return candidate;
        else
           return -1;
    }

    //Time Complexity : O(n2)
    //Space Complexity : O(1)
    private static int majorityElement(int[] a) {
        int len = a.length;
        for (int i = 0; i < len ; i++) {
            int count = 1;
            for (int j = i + 1; j < len ; j++) {
                if(a[i] == a[j]) {
                    count++;
                }
            }
           if(count > (len/2))
               return a[i];
        }
        return -1;
    }
}
