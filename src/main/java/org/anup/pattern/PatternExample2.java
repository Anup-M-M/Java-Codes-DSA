package main.java.org.anup.pattern;

public class PatternExample2 {
    public static void main(String[] args) {
        int num = 9;
        printX(num);
        System.out.println("=========================");
        printPattern1(num);
        System.out.println("=========================");
        printPattern2(num);
    }

    //  0 1 2 3 4
    //0 *       *
    //1   *   *
    //2     *
    //3   *   *
    //4 *       *
    private static void printX(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || i + j == num - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    //0 1 2 3 4 5 6 7 8
    //*       *       *
    //  *   *   *   *
    //    *       *
    //  *   *   *   *
    //*       *       *
    //  *   *   *   *
    //    *       *
    //  *   *   *   *
    //*       *       *
    private static void printPattern1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || i + j == num - 1 ||
                        i + j == (num - 1) / 2 || j - i == (num - 1) / 2 || i - j == (num - 1) / 2 || i + j == ((num - 1) + (num - 1) / 2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    //* * * * * * * * *
    //* * * *   * * * *
    //* * *       * * *
    //* *           * *
    //*               *
    //* *           * *
    //* * *       * * *
    //* * * *   * * * *
    //* * * * * * * * *
    private static void printPattern2(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i + j <= (num - 1) / 2 || j - i >= (num - 1) / 2 || i - j >= (num - 1) / 2 || i + j >= (num - 1) + (num - 1) / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
