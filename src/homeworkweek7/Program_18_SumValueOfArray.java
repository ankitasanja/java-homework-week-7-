package homeworkweek7;

import java.util.Arrays;

/**
 * 18. Write a Java program to sum values of an array.
 */

public class Program_18_SumValueOfArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,};


        int sum = Arrays.stream(array).sum();
        System.out.println("The sum values of an array is  " + sum);
    }
}
