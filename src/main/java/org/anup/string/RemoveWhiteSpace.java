package main.java.org.anup.string;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str="Remove white spaces";
        str = str.replaceAll("\\s", "");
        System.out.println("String after removing all the white spaces : " + str);

        //Replace space with specific character ch
        String string = "Once in a blue moon";
        char ch = '#';
        string =  string.replace(' ', ch);
        System.out.println(string);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) !=  ' ')
                System.out.print(str.charAt(i));
        }
    }
}
