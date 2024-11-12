package solutions;

import java.util.Scanner;

public class AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double average = (A + B + C) / 3;
        System.out.printf("The average is: %.2f%n", average);

        scanner.close();
    }
}
