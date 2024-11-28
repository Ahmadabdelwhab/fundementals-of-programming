public class MathEquations {
    public static void main(String[] args) {
        // 1. Absolute value of a number
        double num1 = -15.5;
        System.out.println("Absolute value of " + num1 + " is: " + Math.abs(num1));

        // 2. Square root of a number
        double num2 = 64;
        System.out.println("Square root of " + num2 + " is: " + Math.sqrt(num2));

        // 3. Power of a number (2 raised to the power of 5)
        double base = 2;
        double exponent = 5;
        System.out.println(base + " raised to the power of " + exponent + " is: " + Math.pow(base, exponent));

        // 4. Rounding a number
        double num3 = 9.57;
        System.out.println("Rounded value of " + num3 + " is: " + Math.round(num3));

        // 5. Minimum of two numbers
        double num4 = 14.4, num5 = 7.6;
        System.out.println("Minimum of " + num4 + " and " + num5 + " is: " + Math.min(num4, num5));

        // 6. Maximum of two numbers
        double num6 = 12.3, num7 = 19.6;
        System.out.println("Maximum of " + num6 + " and " + num7 + " is: " + Math.max(num6, num7));

        // 7. Random number between 0 and 1
        System.out.println("Random number between 0 and 1: " + Math.random());

        // 8. Cosine of an angle (in radians)
        double angle = Math.toRadians(45);  // Convert degrees to radians
        System.out.println("Cosine of 45 degrees is: " + Math.cos(angle));

        // 9. Sine of an angle (in radians)
        System.out.println("Sine of 45 degrees is: " + Math.sin(angle));

        // 10. Tangent of an angle (in radians)
        System.out.println("Tangent of 45 degrees is: " + Math.tan(angle));

        // 11. Exponential function (e raised to the power of x)
        double expBase = 1;
        System.out.println("e raised to the power of " + expBase + " is: " + Math.exp(expBase));

        // 12. Logarithm (natural log) of a number
        double logNum = 20;
        System.out.println("Natural log of " + logNum + " is: " + Math.log(logNum));

        // 13. Logarithm (base 10) of a number
        double log10Num = 1000;
        System.out.println("Log base 10 of " + log10Num + " is: " + M`(log10Num));

        // 14. Ceiling of a number (rounds up)
        double num8 = 6.3;
        System.out.println("Ceiling of " + num8 + " is: " + Math.ceil(num8));

        // 15. Floor of a number (rounds down)
        double num9 = 7.8;
        System.out.println("Floor of " + num9 + " is: " + Math.floor(num9));
    }
}
