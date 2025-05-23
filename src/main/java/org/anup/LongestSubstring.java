package main.java.org.anup;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int res = findLong(str);
        System.out.println(res);
    }

    private static int findLong(String str) {

        HashMap<Character, Integer > map = new HashMap<>();

        int maxLen = 0;
        int start = 0;

        for (int end = 0; end < str.length(); end++) {
            char ch = str.charAt(end);
            if(map.containsKey(ch) && map.get(ch) >= start){
                start = map.get(ch) + 1;
            }

            map.put(ch, end);

            maxLen = Math.max(maxLen, end - start+1);
        }

        return maxLen;
    }
}
