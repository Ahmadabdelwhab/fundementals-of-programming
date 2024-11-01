import java.util.Scanner;

public class ReadFromTerminal {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in);

        // Reading a string
        System.out.print("Enter a string (e.g., Hello World): ");
        String inputString = scanner.nextLine();
        System.out.println("You entered: " + inputString);

        // Reading an integer
        System.out.print("Enter an integer (e.g., 42): ");
        int inputInt = scanner.nextInt();
        System.out.println("You entered: " + inputInt);

        // Reading a double
        System.out.print("Enter a double (e.g., 3.14): ");
        double inputDouble = scanner.nextDouble();
        System.out.println("You entered: " + inputDouble);

        // Reading a boolean
        System.out.print("Enter a boolean (e.g., true): ");
        boolean inputBoolean = scanner.nextBoolean();
        System.out.println("You entered: " + inputBoolean);

        // Reading a single word
        System.out.print("Enter a single word (e.g., Java): ");
        String inputWord = scanner.next();
        System.out.println("You entered: " + inputWord);

        // Close the scanner
        scanner.close();
    }
}
