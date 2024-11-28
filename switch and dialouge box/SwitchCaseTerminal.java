import java.util.Scanner;

public class SwitchCaseTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 3:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("You chose Option 1: Hello!");
    
            case 2:
                System.out.println("You chose Option 2: How are you?");
                
            case 3:
                System.out.println("You chose Option 3: Goodbye!");
                
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
        }

        scanner.close();
    }
}
