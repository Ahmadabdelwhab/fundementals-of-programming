public class StringFunctionsDemo {
    public static void main(String[] args) {
        // String initialization
        String str1 = "Hello, World!";
        String str2 = " Java Programming ";
        String str3 = "HELLO, WORLD!";

        // Length of a string
        System.out.println("Length of str1: " + str1.length());

        // charAt method
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // substring method
        System.out.println("Substring of str1 from index 7: " + str1.substring(7));
        System.out.println("Substring of str1 from index 0 to 5: " + str1.substring(0, 5));

        // indexOf and lastIndexOf methods
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));
        System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf('o'));

        // toUpperCase and toLowerCase methods
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("str1 in lowercase: " + str1.toLowerCase());

        // equals and equalsIgnoreCase methods
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // contains method
        System.out.println("str1 contains 'World': " + str1.contains("World"));

        // startsWith and endsWith methods
        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'World!': " + str1.endsWith("World!"));

        // trim method
        System.out.println("str2 after trim: '" + str2.trim() + "'");

        // replace method
        System.out.println("Replacing 'World' with 'Java' in str1: " + str1.replace("World", "Java"));

        // split method
        String[] words = str1.split(", ");
        System.out.println("Words in str1:");
        for (String word : words) {
            System.out.println(word);
        }

        // join method
        String joinedString = String.join("-", "Java", "is", "fun");
        System.out.println("Joined string: " + joinedString);

        // isEmpty and isBlank methods
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("emptyStr is empty: " + emptyStr.isEmpty());
        System.out.println("blankStr is blank: " + blankStr.isBlank());

        // String format method
        String formattedString = String.format("Name: %s, Age: %d", "Alice", 25);
        System.out.println("Formatted string: " + formattedString);

        // concat method
        System.out.println("Concatenated string: " + str1.concat(" Let's learn Java!"));

        // valueOf method
        int number = 42;
        String numberStr = String.valueOf(number);
        System.out.println("String value of number: " + numberStr);

        // repeat method
        System.out.println("Repeat 'Java' 3 times: " + "Java".repeat(3));
    }
}
