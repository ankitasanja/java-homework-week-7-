package homeworkweek7;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program_12_RecognitionOfNumberSymbolAlphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is a alphabet");

        } else if (ch >= '0' && ch <= '9') {

            System.out.println(ch + " is a number");

        } else {

            System.out.println(ch + " is a symbol");
        }
    }
}
