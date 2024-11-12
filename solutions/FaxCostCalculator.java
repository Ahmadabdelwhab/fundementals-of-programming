package solutions;

import java.util.Scanner;

public class FaxCostCalculator {
    public static void main(String[] args) {
        final double SERVICE_CHARGE = 3.00;
        final double FIRST_10_PAGES_COST = 0.20;
        final double ADDITIONAL_PAGE_COST = 0.10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pages to fax: ");
        int pages = scanner.nextInt();

        double totalCost = SERVICE_CHARGE;

        if (pages <= 10) {
            totalCost += pages * FIRST_10_PAGES_COST;
        } else {
            totalCost += 10 * FIRST_10_PAGES_COST + (pages - 10) * ADDITIONAL_PAGE_COST;
        }

        System.out.printf("Total fax cost: $%.2f%n", totalCost);
        scanner.close();
    }
}
