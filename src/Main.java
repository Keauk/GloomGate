import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a command: ");
            String command = scanner.nextLine();
            // Handle the command
            if (command.equals("exit")) {
                break;
            }
        }
    }
}