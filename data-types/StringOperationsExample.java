public class StringOperationsExample {

    // 1. Concatenation of Strings
    public static void stringConcatenation() {
        String firstName = "John";
        String lastName = "Doe";
        
        // Using + operator for concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Concatenation using + operator: " + fullName);
        
        // Using concat() method
        String fullNameConcat = firstName.concat(" ").concat(lastName);
        System.out.println("Concatenation using concat() method: " + fullNameConcat);
        System.out.println();
    }

    // 2. String Length
    public static void stringLength() {
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("String length of '" + str + "': " + length);
        System.out.println();
    }

    // 3. Character at a Specific Index
    public static void charAtExample() {
        String str = "Hello";
        char charAt2 = str.charAt(2);
        System.out.println("Character at index 2 of '" + str + "': " + charAt2);
        System.out.println();
    }

    // 4. Substring Example
    public static void substringExample() {
        String str = "Programming";
        String subStr1 = str.substring(0, 5);  // Extract from index 0 to 4
        String subStr2 = str.substring(5);     // Extract from index 5 to end
        System.out.println("Original string: " + str);
        System.out.println("Substring (0, 5): " + subStr1);
        System.out.println("Substring (5 to end): " + subStr2);
        System.out.println();
    }

    // 5. String Comparison
    public static void stringComparison() {
        String str1 = "Apple";
        String str2 = "apple";
        String str3 = "Apple";

        System.out.println("Comparing '" + str1 + "' and '" + str2 + "' using equals(): " + str1.equals(str2));  // false
        System.out.println("Comparing '" + str1 + "' and '" + str3 + "' using equals(): " + str1.equals(str3));  // true
        System.out.println("Comparing '" + str1 + "' and '" + str2 + "' using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));  // true
        System.out.println();
    }

    // 6. String Replace Example
    public static void stringReplaceExample() {
        String str = "Java is awesome!";
        String replacedStr = str.replace("awesome", "great");
        System.out.println("Original string: " + str);
        System.out.println("Replaced string: " + replacedStr);
        System.out.println();
    }

    // 7. String Split Example
    public static void stringSplitExample() {
        String str = "apple,banana,cherry";
        String[] fruits = str.split(",");
        System.out.println("Original string: " + str);
        System.out.println("Split string: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
    }

    // 8. String toUpperCase and toLowerCase
    public static void stringCaseConversion() {
        String str = "Hello World";
        System.out.println("Original string: " + str);
        System.out.println("To UpperCase: " + str.toUpperCase());
        System.out.println("To LowerCase: " + str.toLowerCase());
        System.out.println();
    }

    // 9. Trim Example
    public static void trimExample() {
        String str = "   Hello, Java!   ";
        System.out.println("Original string with spaces: '" + str + "'");
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");
        System.out.println();
    }

    // 10. Checking if String Contains Substring
    public static void stringContainsExample() {
        String str = "I love Java programming!";
        boolean containsJava = str.contains("Java");
        System.out.println("Original string: " + str);
        System.out.println("Does the string contain 'Java'? " + containsJava);
        System.out.println();
    }

    // 11. String StartsWith and EndsWith
    public static void stringStartEndCheck() {
        String str = "www.example.com";
        boolean startsWith = str.startsWith("www");
        boolean endsWith = str.endsWith(".com");
        System.out.println("Original string: " + str);
        System.out.println("Starts with 'www'? " + startsWith);
        System.out.println("Ends with '.com'? " + endsWith);
        System.out.println();
    }

    public static void main(String[] args) {
        // Call all string operation functions
        stringConcatenation();
        stringLength();
        charAtExample();
        substringExample();
        stringComparison();
        stringReplaceExample();
        stringSplitExample();
        stringCaseConversion();
        trimExample();
        stringContainsExample();
        stringStartEndCheck();
    }
}
