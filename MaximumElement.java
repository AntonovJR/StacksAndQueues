import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    int number = scanner.nextInt();
                    stack.push(number);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int max = Integer.MIN_VALUE;
                    for (Integer num : stack) {
                        if(num>max){
                            max = num;
                        }
                    }
                    System.out.println(max);

            }
        }
    }
}
