package programs;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.println("Before swap: "+num1+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swap: "+num1+num2);
        scan.close();

    }
}
