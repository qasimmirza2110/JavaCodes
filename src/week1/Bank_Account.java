package week1;
import java.util.Scanner;
public class Bank_Account {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter AccountHolder name: ");
        String accountHolder= scan.next();
        System.out.println("Enter accountNumber: ");
        int accountNumber= scan.nextInt();
        System.out.println("Enter initialBalance: ");
                double initialBalance = scan.nextDouble();
        System.out.println("Enter depositAmount: ");
                double depositAmount = scan.nextDouble();
        System.out.println("Enter withdrawAmount: ");
                double withdrawAmount = scan.nextDouble();
                double currentBalance = initialBalance + depositAmount - withdrawAmount;

                System.out.println("Account Holder: " + accountHolder);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Final Balance: " + currentBalance);

                String accountStatus = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance Not Maintained";
                System.out.println("Account Status: " + accountStatus);
            }
        }


