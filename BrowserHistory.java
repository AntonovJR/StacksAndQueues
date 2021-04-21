import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String command = scanner.nextLine();
        String current = "";
        while (!command.equals("Home")) {
            if (command.equals("back")) {
                if (!stack.isEmpty()) {
                    current = stack.pop();
                } else {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }

            } else {
                if (!current.isEmpty()) {
                    stack.push(current);
                }
                current = command;
            }
            System.out.println(current);
            command = scanner.nextLine();
        }
    }
}
