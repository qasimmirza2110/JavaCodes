package programs;
public class Armstrong_1000 {
    public static void main(String[] args) {
            System.out.println("Armstrong numbers from 1 to 1000:");

            for (int num = 1; num <= 1000; num++) {

                int temp = num;
                int digits = 0;

                // Count digits
                while (temp > 0) {
                    digits++;
                    temp = temp / 10;
                }

                temp = num;
                int sum = 0;

                // Calculate Armstrong sum: rem^digits
                while (temp > 0) {
                    int rem = temp % 10;

                    int power = 1;
                    for (int i = 1; i <= digits; i++) {
                        power = power * rem;
                    }

                    sum = sum + power;
                    temp = temp / 10;
                }

                // Check Armstrong
                if (sum == num) {
                    System.out.print(num+" ");
                }
            }
        }
    }


