package homeworkweek7;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Program_19_AverageValue {

    public static void main(String[] args) {

        int[] array = {2, 8, 6, 3, 7};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println("Average value of array elements: " + average);
    }


}
