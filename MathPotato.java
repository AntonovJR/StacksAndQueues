import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String name : names) {
            queue.offer(name);
        }
        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {

                queue.offer(queue.poll());
            }
                if (!isPrime(cycle)) {

                    System.out.println("Removed " + queue.poll());

                } else {
                    System.out.println("Prime " + queue.peek());

                }
                cycle++;

        }
        System.out.println("Last is " + queue.poll());
    }
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}

