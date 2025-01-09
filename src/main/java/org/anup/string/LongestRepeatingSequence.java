package main.java.org.anup.string;

//find the longest repeating sequence in a string.
// need to find the substring which has been repeated in the original string more than once.
public class LongestRepeatingSequence {
    public static void main(String[] args) {
        String str = "acbdfghybdf";
        String result = findLongestRepeatingSequence(str);
        System.out.println(result);
    }

    private static String findLongestRepeatingSequence(String str) {
        String longestSequence = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                //Checks for the largest common factors in every substring
                String subString = commonPrefix(str.substring(i), str.substring(j));
                //If the current prefix is greater than previous one
                //then it takes the current one as longest repeating sequence
                if(subString.length() > longestSequence.length())
                    longestSequence = subString;
            }
        }
        return longestSequence;
    }

    private static String commonPrefix(String substring1, String substring2) {
        int len = Math.min(substring1.length(), substring2.length());
        for (int i = 0; i < len; i++) {
            if(substring1.charAt(i) != substring2.charAt(i))
                return substring1.substring(0,i);
        }
        return substring1.substring(0,len);
    }
}
