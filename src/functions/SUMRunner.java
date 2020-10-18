package functions;
import java.util.Scanner;
public class SUMRunner
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number one: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter number two: ");
        double num2 = scan.nextDouble();
        
        SUM sum = new SUM();
        
        System.out.println("\nVoid Method :: ");
        sum.sumV(num1, num2);
        System.out.println("\nReturn Method :: ");
        System.out.println(num1 + " + " + num2 + " = " + sum.sumR(num1, num2));
    }
}