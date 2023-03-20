package homeworkweek7;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program_8_AlphabetIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F: ");
        char ch = sc.next().charAt(0);
        if (ch == 'A') {
            System.out.println("City name is Abingdon");
        } else if (ch == 'B') {
            System.out.println("City name is Bath");
        } else if (ch == 'C') {
            System.out.println("City name is Calne");
        } else if (ch == 'D') {
            System.out.println("City name is Didcot");
        } else if (ch == 'E') {
            System.out.println("City name is Ely");
        } else if (ch == 'F') {
            System.out.println("City name is Fleet");
        } else {
            System.out.println("Invalid entry");
        }

        sc.close();

    }
}
