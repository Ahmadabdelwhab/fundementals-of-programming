package solutions;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) throws Exception {
        // Open input and output files
        Scanner inFile = new Scanner(new File("inData.txt"));
        PrintWriter outFile = new PrintWriter("outData.dat");

        // Read rectangle data
        double length = inFile.nextDouble();
        double width = inFile.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Read circle data
        double radius = inFile.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Read personal info
        String firstName = inFile.next();
        String lastName = inFile.next();
        int age = inFile.nextInt();

        // Read savings info
        double balance = inFile.nextDouble();
        double interestRate = inFile.nextDouble();
        double newBalance = balance + (balance * (interestRate / 100));

        // Read and process a character
        char letter = inFile.next().charAt(0);
        char nextChar = (char) (letter + 1);

        // Output results
        outFile.printf("Rectangle: Length = %.2f, Width = %.2f, Area = %.2f, Perimeter = %.2f%n", length, width, area, perimeter);
        outFile.printf("Circle: Radius = %.2f, Area = %.2f, Circumference = %.2f%n", radius, circleArea, circumference);
        outFile.printf("Name: %s %s, Age: %d%n", firstName, lastName, age);
        outFile.printf("Balance at the end of the month: $%.2f%n", newBalance);
        outFile.printf("The character after '%c' is '%c'%n", letter, nextChar);

        // Close files
        inFile.close();
        outFile.close();
    }
}
