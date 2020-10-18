package functions;
import java.util.Scanner;
public class FToCRunner
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit number --> ");
        FToC s = new FToC();
        double r = key.nextDouble();
        System.out.println("Void Method :: ");
        s.VoidFC(r);
        System.out.println("\nReturn Method :: ");
        System.out.println(r + " degrees Fahrenheit == " + s.ReturnFC(r) + " degrees Celsius");
    }
}