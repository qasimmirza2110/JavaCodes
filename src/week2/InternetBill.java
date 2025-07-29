package week2;

import java.util.Scanner;

public class InternetBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total data consumed (GB): ");
        int dataUsed = sc.nextInt();

        int fixedCharge = 300;
        int variableCharge = 0;

        if (dataUsed < 10) {
            variableCharge = 0;
        } else if (dataUsed <= 30) {
            variableCharge = (dataUsed - 10) * 5;
        } else {
            variableCharge = (20 * 5) + (dataUsed - 30) * 3;
        }

        int totalBill = fixedCharge + variableCharge;

        System.out.println("Data Used: " + dataUsed + " GB");
        System.out.println("Fixed Charge: Rs. " + fixedCharge);
        System.out.println("Variable Charge: Rs. " + variableCharge);
        System.out.println("Total Internet Bill: Rs. " + totalBill);
    }
}
