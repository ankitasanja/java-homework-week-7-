package homeworkweek7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Program_10_Symbol {

    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println("Addition of " + num1 + "+" + num2 + " = " + (num1 + num2));

        } else if (operator == '-') {
            System.out.println("Subtraction of " + num1 + "-" + num2 + " = " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Multiplication of " + num1 + "*" + num2 + " = " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("Division of " + num1 + "/" + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Operator is not available");
        }
        sc.close();
    }

}
