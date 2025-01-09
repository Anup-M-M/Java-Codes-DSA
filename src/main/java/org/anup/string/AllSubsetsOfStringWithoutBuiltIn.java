package main.java.org.anup.string;

public class AllSubsetsOfStringWithoutBuiltIn {
    public static void main(String[] args) {
        String str = "FUN";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                printAllSubStrings(str, i, j+1);
            }
        }
    }

    private static void printAllSubStrings(String str, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
