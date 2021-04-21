import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> nums = new ArrayDeque<>();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        for (int i = 0; i < x ; i++) {
            int input = scanner.nextInt();
            nums.offer(input);

        }
        for (int i = 0; i <y ; i++) {
            nums.poll();
        }
        if(nums.isEmpty()){
            System.out.println("0");
            return;
        }

        if(nums.contains(z)){
            System.out.println("true");
        }else{
            int min = Integer.MAX_VALUE;
            for (Integer num : nums) {
                if(num<min){
                    min = num;
                }
            }
            System.out.println(min);
        }


    }
}
