package SimpleCalculator;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        printWelcomeMessage();
        while (continueCalculating) {
            try {
                printMenu();
                System.out.print("Enter your choice (1-5): ");
                int choice = scanner.nextInt();
                if (choice == 5) {
                    printExitMessage();
                    break;
                }
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                performOperation(choice, num1, num2);
            } catch (Exception e) {
                System.out.println("\n[Error]: Invalid input. Please enter numeric values only.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static void printWelcomeMessage() {
        System.out.println("=========================================");
        System.out.println("       Welcome to the Calculator         ");
        System.out.println("=========================================");
        System.out.println("Perform basic arithmetic operations with ease!");
    }

    private static void printMenu() {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (×)");
        System.out.println("4. Division (÷)");
        System.out.println("5. Exit");
    }

    private static void performOperation(int choice, double num1, double num2) {
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case 2:
                result = num1 - num2;
                System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case 3:
                result = num1 * num2;
                System.out.printf("Result: %.2f × %.2f = %.2f%n", num1, num2, result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("[Error]: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f ÷ %.2f = %.2f%n", num1, num2, result);
                }
                break;
            default:
                System.out.println("[Error]: Invalid choice. Please select a valid operation.");
        }
    }

    private static void printExitMessage() {
        System.out.println("=========================================");
        System.out.println("       Thank you for using the Calculator");
        System.out.println("             Have a great day!           ");
        System.out.println("=========================================");
    }
}
