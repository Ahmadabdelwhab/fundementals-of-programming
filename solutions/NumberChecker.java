package solutions;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
