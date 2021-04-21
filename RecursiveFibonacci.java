import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] fibMemArray = new long[51];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        fibMemArray[0] = 1;
        fibMemArray[1] = 1;
        System.out.println(Fibonacci(input+1));

    }

    static long Fibonacci(long n) {
        long fib = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibMemArray[(int) n] != 0) {
            //System.out.println("mem");
            return fibMemArray[(int) n];
        } else {
            fib = Fibonacci(n - 1) + Fibonacci(n - 2);
            fibMemArray[(int) n] = fib;
            return fib;
        }
    }
}
