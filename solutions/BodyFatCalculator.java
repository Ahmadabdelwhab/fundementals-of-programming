package solutions;

import java.util.Scanner;

public class BodyFatCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender (male/female): ");
        String gender = scanner.next().toLowerCase();

        System.out.print("Enter body weight (in pounds): ");
        double bodyWeight = scanner.nextDouble();

        double bodyFat = 0, bodyFatPercentage = 0;

        if (gender.equals("female")) {
            System.out.print("Enter wrist measurement (in inches): ");
            double wrist = scanner.nextDouble();

            System.out.print("Enter waist measurement (in inches): ");
            double waist = scanner.nextDouble();

            System.out.print("Enter hip measurement (in inches): ");
            double hip = scanner.nextDouble();

            System.out.print("Enter forearm measurement (in inches): ");
            double forearm = scanner.nextDouble();

            double A1 = (bodyWeight * 0.732) + 8.987;
            double A2 = wrist / 3.140;
            double A3 = waist * 0.157;
            double A4 = hip * 0.249;
            double A5 = forearm * 0.434;

            double B = A1 + A2 - A3 - A4 + A5;
            bodyFat = bodyWeight - B;
            bodyFatPercentage = (bodyFat * 100) / bodyWeight;

        } else if (gender.equals("male")) {
            System.out.print("Enter waist measurement (in inches): ");
            double waist = scanner.nextDouble();

            double A1 = (bodyWeight * 1.082) + 94.42;
            double A2 = waist * 4.15;

            double B = A1 - A2;
            bodyFat = bodyWeight - B;
            bodyFatPercentage = (bodyFat * 100) / bodyWeight;

        } else {
            System.out.println("Invalid gender entered. Please enter 'male' or 'female'.");
            scanner.close();
            return;
        }

        System.out.printf("Body Fat: %.2f pounds%n", bodyFat);
        System.out.printf("Body Fat Percentage: %.2f%%%n", bodyFatPercentage);

        scanner.close();
    }
}

