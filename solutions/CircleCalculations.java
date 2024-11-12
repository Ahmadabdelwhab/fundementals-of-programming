package solutions;

public class CircleCalculations {
    public static void main(String[] args) {
        double radius = 5.5;
        double pi = Math.PI;

        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.printf("Perimeter of the circle: %.2f%n", perimeter);
        System.out.printf("Area of the circle: %.2f%n", area);
    }
}
