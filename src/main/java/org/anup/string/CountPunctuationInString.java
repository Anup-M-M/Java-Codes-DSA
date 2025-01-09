package main.java.org.anup.string;

// Count the Total Number of Punctuation Characters Exists in a String
public class CountPunctuationInString {

    public static void main(String[] args) {
        String string = "He said, 'The anup loves to write the code.' I heard it with my own ears.";
        int count = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '!' || string.charAt(i) == '.' || string.charAt(i) == ';'
                    || string.charAt(i) == '\"' || string.charAt(i) == ','|| string.charAt(i) == '\''
                    || string.charAt(i) == '?' || string.charAt(i) == ':'){
                count++;
            }
        }
        System.out.println("\nThe number of punctuations exists in the string is: " +count);
    }
}
