package homeworkweek7;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

public class Program_5_SalarySlip {


    public void salarySlip(int empID, String empName, double basicSalary) {
        double HRA = 0.1 * basicSalary;
        double DA = 0.08 * basicSalary;
        double TA = 0.09 * basicSalary;
        double PF = 0.2 * basicSalary;

        double grossSalary = basicSalary + HRA + TA + DA - PF;

        System.out.println("|------------------------------------|");
        System.out.println("|           Salary Slip              |");
        System.out.println("|------------------------------------|");
        System.out.println("|Employee Id  :     " + empID + "             |");
        System.out.println("|Employee Name:    " + empName + "               |");
        System.out.println("|------------------------------------|");
        System.out.println("|Basic Salary :     " + basicSalary + "          |");
        System.out.println("|HRA 10%      :     " + HRA + "           |");
        System.out.println("|TA 8%        :     " + TA + "           |");
        System.out.println("|DA 9%        :    " + DA + "            |");
        System.out.println("|PF - 20%     :    " + PF + "            |");
        System.out.println("|------------------------------------|");
        System.out.println("|Gross Salary :    " + grossSalary + "           |");
        System.out.println("|====================================|");


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        int empID = sc.nextInt();

        System.out.println("Enter employee name: ");
        String empName = sc.next();

        System.out.println("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        Program_5_SalarySlip obj = new Program_5_SalarySlip();
        obj.salarySlip(empID, empName, basicSalary);

        sc.close();

    }
}
