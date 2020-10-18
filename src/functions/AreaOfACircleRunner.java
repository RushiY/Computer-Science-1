package functions;
import java.util.Scanner;
public class AreaOfACircleRunner
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the first number --> ");
        AreaOfACircle s = new AreaOfACircle();
        double r = key.nextDouble();
        System.out.println("Void Method :: ");
        s.VoidAC(r);
        System.out.println("\nReturn Method :: ");
        System.out.println("The surface area is :: " + s.ReturnAC(r));
    }
}