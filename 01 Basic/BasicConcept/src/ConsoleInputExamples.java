import java.io.Console;
import java.util.Scanner;

public class ConsoleInputExamples {

    public static void scannerInputDemo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1. SCANNER INPUT EXAMPLES:");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        scanner.nextLine();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters");
    }

//    public static void consoleDemo() {
//        Console console = System.console();
//        System.out.println("\n CONSOLE INPUT EXAMPLES:");
//        String username = console.readLine("Enter username: ");
//        System.out.println("Username: " + username);
//    }
}
