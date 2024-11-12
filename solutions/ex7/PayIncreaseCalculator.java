package solutions.ex7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PayIncreaseCalculator {
    public static void main(String[] args) {
        // File paths
        String inputFileName = "Ch3_Ex7Data.txt";
        String outputFileName = "Ch3_Ex7Output.dat";

        try (Scanner inputFile = new Scanner(new File(inputFileName));
             FileWriter outputFile = new FileWriter(outputFileName)) {

            // Process the first employee
            if (inputFile.hasNext()) {
                String lastName = inputFile.next();
                String firstName = inputFile.next();
                double currentSalary = inputFile.nextDouble();
                double percentIncrease = inputFile.nextDouble();
                double updatedSalary = currentSalary + (currentSalary * percentIncrease / 100);
                outputFile.write(String.format("%s %s %.2f%n", firstName, lastName, updatedSalary));
            }

            // Process the second employee
            if (inputFile.hasNext()) {
                String lastName = inputFile.next();
                String firstName = inputFile.next();
                double currentSalary = inputFile.nextDouble();
                double percentIncrease = inputFile.nextDouble();
                double updatedSalary = currentSalary + (currentSalary * percentIncrease / 100);
                outputFile.write(String.format("%s %s %.2f%n", firstName, lastName, updatedSalary));
            }

            // Process the third employee
            if (inputFile.hasNext()) {
                String lastName = inputFile.next();
                String firstName = inputFile.next();
                double currentSalary = inputFile.nextDouble();
                double percentIncrease = inputFile.nextDouble();
                double updatedSalary = currentSalary + (currentSalary * percentIncrease / 100);
                outputFile.write(String.format("%s %s %.2f%n", firstName, lastName, updatedSalary));
            }

            System.out.println("Data successfully written to " + outputFileName);

        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }
}
