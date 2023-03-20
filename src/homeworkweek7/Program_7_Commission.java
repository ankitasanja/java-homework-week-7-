package homeworkweek7;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program_7_Commission {

    double commissionRate;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales id: ");
        int salesId = sc.nextInt();

        System.out.println("Enter seller's name: ");
        String sellerName = sc.next();

        System.out.println("Enter sales amount: ");
        double salesAmount = sc.nextDouble();

        System.out.println("Enter basic salary: ");
        int basicSalary = sc.nextInt();

        Program_7_Commission obj = new Program_7_Commission();
        obj.salesCommission(salesId, sellerName, salesAmount, basicSalary);


        sc.close();
    }

    public void salesCommission(int salesId, String sellerName, double salesAmount, int basicSalary) {
        if (salesAmount >= 50000) {
            System.out.println("commissionRate is: 0.35");
        } else if (salesAmount >= 30000) {
            System.out.println("commissionRate is: 0.20");
        } else if (salesAmount >= 20000) {
            System.out.println("commissionRate is: 0.10");
        } else if (salesAmount >= 10000) {
            System.out.println("commissionRate is: 0.05");
        } else {
            System.out.println("commissionRate is: 0.02");
        }

        double commission = salesAmount * commissionRate;
    }
}