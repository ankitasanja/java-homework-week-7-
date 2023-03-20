package homeworkweek7;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */
public class Program_20_SpecificValue {

    public static void main(String[] args) {
        int[] userInput = {2, 14, 3, 28, 6, 7};
        int specificElement = 28;
        getSpecificElement(userInput, specificElement);
    }

    public static void getSpecificElement(int[] userInput, int specificElement) {

        int[] input = userInput;
        int elements = specificElement;
        for (int i = 0; i < userInput.length; i++) {
            System.out.println("" + input[i]);

            if (input[i] == elements) {
                System.out.println("YES");
            }
        }
    }
}
