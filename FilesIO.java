import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;



public class FilesIO
{
    public static void main(String []args){
        try{
            
            FileReader fr =new FileReader("hello.txt");
            Scanner sc = new Scanner(fr);
            PrintWriter writer = new PrintWriter("outputData.txt");
            //a
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            double recatangelArea = length * width;
            double perimeter = (length + width) * 2;
            writer.println("length = " + length + " width = " + width + " area = " + recatangelArea + " perimeter = " + perimeter);
            //b
            double radius = sc.nextDouble();
            double circleArea = radius * radius * 3.14;
            double circumference = 2 * radius * 3.14;
            writer.println("area of circle = " + circleArea + " circumference = " + circumference);
            //c
            String firstName = sc.next();
            String lastName = sc.next();
            int age = sc.nextInt();
            writer.println("First name : " + firstName + " Last name : " + lastName + " Age : " + age);
            //d
            double begginningBalance = sc.nextDouble();
            double interestRate = sc.nextDouble();
            //the balance at the end of the month
            double interest = begginningBalance * interestRate / 100;
            double endBalance = begginningBalance + interest;
            writer.println("Beginning balance = " + begginningBalance + " Interest rate = " + interestRate + " Interest = " + interest + " End balance = " + endBalance);
            //e
            char ch = sc.next().charAt(0);
            writer.println("the character after " + ch + " is " + (char)(ch + 1));
            //f
            



            sc.close();
            fr.close();
            writer.close();
    }catch(IOException e)
    {
        System.out.println(e);
    }
}
}
