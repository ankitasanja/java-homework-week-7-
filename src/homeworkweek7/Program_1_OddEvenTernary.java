package homeworkweek7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Program_1_OddEvenTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // using ternary operator
        String evenOdd = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + evenOdd);
        scanner.close();
    }
}



