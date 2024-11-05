// Filename: ConditionalStatementsDemo.java

import java.util.Scanner;

public class ConditionalStatementsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. if Statement
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Nested if example
        if (age >= 0) {
            if (age >= 65) {
                System.out.println("You are a senior citizen.");
            } else if (age >= 18) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a minor.");
            }
        } else {
            System.out.println("Invalid age entered.");
        }

        // 2. if-else Statement
        System.out.print("Enter a number to check if it’s positive or negative: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        }else if(number == 0){
            System.out.println("this number is zero");
        } else {
            System.out.println("The number is negative.");
        }

        // 3. else-if Ladder
        System.out.print("Enter your marks to determine your grade: ");
        int marks = scanner.nextInt();
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        // 4. switch Statement
        System.out.print("Enter a number from 1 to 7 to display the day of the week: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        scanner.close();
    }
}
