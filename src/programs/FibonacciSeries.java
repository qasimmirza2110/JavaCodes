package programs;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int a=0, b=1;
        System.out.print("Fibonacci series: ");
        for (int i =1;i<=num;i++){
            System.out.print(a);
                    if(i<num){
                System.out.print(",");
            }
            int next=a+b;
            a=b;
            b=next;

        }
        scan.close();
    }
}
