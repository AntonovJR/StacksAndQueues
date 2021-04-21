import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] nums = scanner.nextLine().split("\\s+");
        for (String num : nums) {
            stack.push(Integer.parseInt(num));
        }
        while(stack.size()>0){
            System.out.print(stack.pop()+" ");
        }

    }
}
