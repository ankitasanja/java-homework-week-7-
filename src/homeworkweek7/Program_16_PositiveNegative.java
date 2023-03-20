package homeworkweek7;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program_16_PositiveNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + " is NEGATIVE number");
        } else {
            System.out.println("number is zero");
        }
        sc.close();
    }
}
