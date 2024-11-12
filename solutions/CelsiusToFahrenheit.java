package solutions;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);

        scanner.close();
    }
}
