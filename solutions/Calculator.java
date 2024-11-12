package solutions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two integers and the operator
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Variable to store the result
        double result = 0;
        
        // Perform operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = (double) num1 / num2;
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
        
        scanner.close();
    }
}
