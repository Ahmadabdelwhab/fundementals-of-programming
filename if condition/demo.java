import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // && = and
        //|| = or

        if((number > 10) || (number %2 != 0)){
            System.out.println("hello");
        }
    }
}
