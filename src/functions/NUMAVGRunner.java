package functions;
import java.util.Scanner;
public class NUMAVGRunner
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        NUMAVG m = new NUMAVG();
        
        System.out.print("Enter a first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = scan.nextInt();
        
        System.out.println("Void Method::");
        m.averageV(num1,num2);
        System.out.println("\nReturn Method::");
        System.out.println((double)num1 + " + " +  (double)num2 + " has an average of " + m.averageR(num1, num2));
    }
}