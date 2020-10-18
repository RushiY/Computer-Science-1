package functions;
import java.util.Scanner;
public class SlopeOfALineRunner
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        SlopeOfALine s = new SlopeOfALine();
        System.out.print("Enter the first number --> ");
        double x1 = key.nextDouble();
        
        System.out.print("Enter the second number --> ");
        double y1 = key.nextDouble();
        
        System.out.print("Enter the third number --> ");
        double x2 = key.nextDouble();
        
        System.out.print("Enter the fourth number --> ");
        double y2 = key.nextDouble();
        
        System.out.println("Void Method :: ");
        s.VoidS(x1,y1,x2,y2);
        System.out.println("\nReturn Method :: ");
        System.out.println("The slope is :: " + s.ReturnS(x1,y1,x2,y2));
    }
}