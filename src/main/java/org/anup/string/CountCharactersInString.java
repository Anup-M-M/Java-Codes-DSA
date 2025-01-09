package main.java.org.anup.string;

// // count the total number of characters in a string
public class CountCharactersInString{
    public static void main(String[] args) {
        String string = "The best of luck";
        int count=0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("\nTotal number of characters in a string: "+count);
    }
}
