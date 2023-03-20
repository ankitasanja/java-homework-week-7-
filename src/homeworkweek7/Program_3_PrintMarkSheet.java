package homeworkweek7;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________
 */

public class Program_3_PrintMarkSheet {

    static String result; // result is static variable
    static String grade;  // grade is static variable

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String studentName = scanner.next();

        System.out.println("Enter Roll no: ");
        int rollNo = scanner.nextInt();

        System.out.println("Enter Maths mark: ");
        int maths = scanner.nextInt();

        System.out.println("Enter Science marks: ");
        int science = scanner.nextInt();

        System.out.println("Enter English mark: ");
        int english = scanner.nextInt();
        if ((maths > 0 || maths < 100) && (science > 0 || science < 100) && (english > 0 || english < 100)) {
            System.out.println("Marks is in 0 to 100");
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        }
        int total = maths + science + english;
        System.out.println(total);
        double percentage = ((total * 100) / 300);
        System.out.println(percentage);
        if (percentage >= 80) {
            System.out.println(" A+ ");
            Program_3_PrintMarkSheet.result = "Pass";
            Program_3_PrintMarkSheet.grade = "A+";
        } else if (percentage >= 60) {
            System.out.println(" A ");
            Program_3_PrintMarkSheet.result = "Pass";
            Program_3_PrintMarkSheet.grade = " A ";
        } else if (percentage >= 50) {
            System.out.println(" B ");
            Program_3_PrintMarkSheet.result = "Pass";
            Program_3_PrintMarkSheet.grade = " B ";
        } else if (percentage >= 35) {
            System.out.println(" C ");
            Program_3_PrintMarkSheet.result = "Pass";
            Program_3_PrintMarkSheet.grade = " C ";
        } else {
            System.out.println("Fail");
            Program_3_PrintMarkSheet.result = "Fail";
            Program_3_PrintMarkSheet.grade = " F ";
        }

        System.out.println("|--------------------------------------|");
        System.out.println("|                                      |");
        System.out.println("|            MARK SHEET                |");
        System.out.println("|                                      |");
        System.out.println("|--------------------------------------|");
        System.out.println("|   Name      : "     + studentName + "                    |");
        System.out.println("|   Roll No   :" + rollNo + "                       |");
        System.out.println("|--------------------------------------|");
        System.out.println("|  Subjects   :"  + "Marks                   |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Maths        :"  + maths + "                      |");
        System.out.println("|Science      : "  + science + "                     |");
        System.out.println("|English      : "+ english + "                     |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Total        :"  + total + "                     |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Percentage   :" + percentage + "                   |");
        System.out.println("|Result       :"  + result + "                   |");
        System.out.println("|Grade        :"  + grade + " + " + "                  |");
        System.out.println("|--------------------------------------|");

    }
}


