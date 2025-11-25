package programs;
import java.util.Scanner;
public class rev_num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num = scan.nextInt();
        int rev=0;
        int rem;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        System.out.println("Reverse of is: "+rev);
    }
}
