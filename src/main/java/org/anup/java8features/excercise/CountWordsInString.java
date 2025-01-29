package main.java.org.anup.java8features.excercise;

import java.util.function.Function;

//count words in a sentence.
public class CountWordsInString {
    public static void main(String[] args) {

        String text = "Java lambda expression";

        Function<String, Integer> countWords = str -> str.split(" ").length;
        int countWordsInString = countWords.apply(text);
        System.out.println(countWordsInString);
    }
}
