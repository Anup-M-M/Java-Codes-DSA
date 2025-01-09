package main.java.org.anup.string;

//count the total number of vowels and consonants in a string
public class CountVowelConsonantInString {
    public static void main(String[] args) {
        String str = "This is a really simple sentence";
        int vowelsCount = 0, consonantsCount = 0;
        //Converting entire string to lower case to reduce the comparisons
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowelsCount++;
            }else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
                consonantsCount++;
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
