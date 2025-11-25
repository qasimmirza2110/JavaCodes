package programs;
import java.util.Scanner;
public class Largestarray {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check largest array: ");
        int num = scan.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter "+num+" elements: ");
        for (int i = 0;i<num;i++){
            arr[i]=scan.nextInt();

        }
        int max = arr[0];
        for (int i =1; i<num;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("Largest element in array: "+max);
        scan.close();
    }
}
