package solutions;

public class ReservedWordsAndIdentifiers {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Examples of valid identifiers:
        int myFirstProgram = 0;
        int MIX_UP = 1;
        int JavaProgram2 = 2;

        // Reserved word example:
        // int int = 5; --> This will cause an error because 'int' is a reserved word.
        
        // Reserved words in Java:
        // Correct usage:
        int number = 10;
        System.out.println("Valid identifier example: number = " + number);
    }
}
