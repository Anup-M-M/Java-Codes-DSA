package main.java.org.anup.java8features.lambda;

interface C{
    int add(int i, int j);
}

public class LambdaExpressionWithReturnType {

    public static void main(String[] args) {

        // no need to write the return statement when we have one statement
        C obj= (i, j) -> i+j;

        int result = obj.add(8, 7);

        System.out.println(result);
    }
}
