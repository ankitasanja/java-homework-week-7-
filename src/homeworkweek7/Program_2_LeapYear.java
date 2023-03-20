package homeworkweek7;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Program_2_LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year: ");
        int year = scanner.nextInt();
        Program_2_LeapYear obj = new Program_2_LeapYear();
        obj.checkLeapYear(year);

        scanner.close();

    }

    // using conditional statement if else
    public void checkLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year. ");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year. ");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year. ");
        } else {
            System.out.println(year + " is not a leap year. ");
        }
    }
}
