package programs;
import java.util.Scanner;

public class isPrime {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check a prime");
        int num = scan.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        else {
        for (int i =2 ;i<=Math.sqrt(num);i++){
            if (num%i==0){
            isPrime=false;
            break;}
        }
        }
        if(isPrime)
            System.out.println(num+" is a prime number");
        else
            System.out.println(num+" isn't a prime number ");
        scan.close();
    }
}
