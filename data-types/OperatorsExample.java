public class OperatorsExample {

    // Arithmetic Operators
    public static void arithmeticOperators() {
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println();
    }

    // Relational Operators
    public static void relationalOperators() {
        int x = 10;
        int y = 20;
        System.out.println("Relational Operators:");
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println();
    }

    // Logical Operators
    public static void logicalOperators() {
        boolean a = true;
        boolean b = false;
        System.out.println("Logical Operators:");
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
        System.out.println();
    }

    // Assignment Operators
    public static void assignmentOperators() {
        int a = 10;
        int b = 5;
        System.out.println("Assignment Operators:");
        a += b;
        System.out.println("a += b: " + a);
        a -= b;
        System.out.println("a -= b: " + a);
        a *= b;
        System.out.println("a *= b: " + a);
        a /= b;
        System.out.println("a /= b: " + a);
        a %= b;
        System.out.println("a %= b: " + a);
        System.out.println();
    }

    // Increment and Decrement Operators
    public static void incrementDecrementOperators() {
        int x = 5;
        System.out.println("Increment and Decrement Operators:");
        System.out.println("x++: " + x++);  // 5
        System.out.println("++x: " + ++x);  // 7
        System.out.println("x--: " + x--);  // 7
        System.out.println("--x: " + --x);  // 5
        System.out.println();
    }

    // Bitwise Operators
    public static void bitwiseOperators() {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011
        System.out.println("Bitwise Operators:");
        System.out.println("a & b: " + (a & b));  // 1 (Binary: 0001)
        System.out.println("a | b: " + (a | b));  // 7 (Binary: 0111)
        System.out.println("a ^ b: " + (a ^ b));  // 6 (Binary: 0110)
        System.out.println("~a: " + (~a));        // -6
        System.out.println("a << 1: " + (a << 1)); // 10 (Binary: 1010)
        System.out.println("a >> 1: " + (a >> 1)); // 2 (Binary: 0010)
        System.out.println();
    }

    // Ternary Operator
    public static void ternaryOperator() {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("Max value: " + max);
        System.out.println();
    }

    // instanceof Operator
    public static void instanceofOperator() {
        String name = "Java";
        System.out.println("instanceof Operator:");
        boolean result = name instanceof String;
        System.out.println("Is name an instance of String? " + result);
        System.out.println();
    }

    // Shift Operators
    public static void shiftOperators() {
        int a = 8;  // Binary: 1000
        System.out.println("Shift Operators:");
        System.out.println("a << 2: " + (a << 2));  // 32 (Binary: 100000)
        System.out.println("a >> 2: " + (a >> 2));  // 2 (Binary: 0010)
        System.out.println();
    }

    public static void main(String[] args) {
        // Call each function to demonstrate all operators
        arithmeticOperators();
        relationalOperators();
        logicalOperators();
        assignmentOperators();
        incrementDecrementOperators();
        bitwiseOperators();
        ternaryOperator();
        instanceofOperator();
        shiftOperators();
    }
}
