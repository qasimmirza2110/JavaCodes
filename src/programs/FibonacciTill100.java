package programs;
public class FibonacciTill100 {
    public static void main(String[] args) {
        int x = 0, y = 1;

        System.out.print("Fibonacci Series up to 100: "+x+" "+y);

        int z = x + y;
        while (z <= 100) {
            System.out.print(" " + z);
            x = y;
            y = z;
            z = x + y;

    }
}
}
