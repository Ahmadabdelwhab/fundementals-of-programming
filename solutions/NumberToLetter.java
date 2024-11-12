package solutions;

import java.util.Scanner;

public class NumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer between 0 and 35
        System.out.print("Enter an integer between 0 and 35: ");
        int num = scanner.nextInt();
        
        // Check if the number is within the valid range
        if (num >= 0 && num <= 35) {
            if (num <= 9) {
                // If the number is less than or equal to 9, print it as is
                System.out.println("The output is: " + num);
            } else {
                // For numbers 10 or greater, output the corresponding letter
                char letter = (char) ('A' + (num - 10)); // Convert number to letter
                System.out.println("The output is: " + letter);
            }
        } else {
            // If the number is out of the valid range
            System.out.println("Please enter a number between 0 and 35.");
        }

        scanner.close();
    }
}
