package homeworkweek7;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Program_17_SortArray {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 3, 8};
        String[] name = {"potato", "tomato", "onion", "beans", "cauliflower"};

        // Sorting the numeric array
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // Sorting the string array
        Arrays.sort(name);
        System.out.println("Sorted strings: " + Arrays.toString(name));

    }
}
