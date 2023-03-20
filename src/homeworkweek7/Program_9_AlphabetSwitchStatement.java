package homeworkweek7;

import java.util.Scanner;

/**
 * 9. Same as above program-8 using switch statement.
 */
public class Program_9_AlphabetSwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any alphabet from A to F: ");
        char alphabet = sc.next().charAt(0);

        switch (alphabet) {
            case 'A':
                System.out.println("Abingdon");
                break;
            case 'B':
                System.out.println("Bath");
                break;
            case 'C':
                System.out.println("Calne");
                break;
            case 'D':
                System.out.println("Didcot");
                break;
            case 'E':
                System.out.println("Ely");
                break;
            case 'F':
                System.out.println("Fleet");
                break;
            default:
                System.out.println("Invalid entry");
        }
        sc.close();
    }
}
