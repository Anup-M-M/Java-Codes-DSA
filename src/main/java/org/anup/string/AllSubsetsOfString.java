package main.java.org.anup.string;

// find all subsets of a string
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Subset of a string is the character or the group of characters that are present inside the string without considering the order of elements.
public class AllSubsetsOfString {

    public static void main(String[] args) {
        String str = "FUN";
       // genarateSubSetV1(str);

        List<String> allSubsets = generateSubsetsV2(str);

        for (String subset : allSubsets) {
            System.out.println("\"" + subset + "\"");
        }

    }

    private static void genarateSubSetV1(String str) {
        int len = str.length();
        int temp = 0;

        //Total possible subsets for string of size n is n*(n+1)/2
        String[] arr = new String[(len*(len+1)/2)];

        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                arr[temp] = str.substring(i, j+1);
                temp++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static List<String> generateSubsetsV2(String str) {
        List<String> subsets = new ArrayList<>();
        generateSubsetsHelper(str, "", 0, subsets);
        return subsets;
    }
    // Helper method for recursion
    private static void generateSubsetsHelper(String str, String current, int index, List<String> subsets) {
        if (index == str.length()) {
            subsets.add(current);
            return;
        }

        // Exclude the current character and proceed
        generateSubsetsHelper(str, current, index + 1, subsets);

        // Include the current character and proceed
        generateSubsetsHelper(str, current + str.charAt(index), index + 1, subsets);
    }
}
