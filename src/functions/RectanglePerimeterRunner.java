package functions;
import java.util.Scanner;
public class RectanglePerimeterRunner
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the length: ");
        int length = scan.nextInt();
        
        System.out.print("Enter the width: ");
        int width = scan.nextInt();
        
        RectanglePerimeter rectangle = new RectanglePerimeter();
        
        System.out.println("\nVoid Method :: ");
        rectangle.perimeterV(length, width);
        
        System.out.println("\nReturn Method :: ");
        rectangle.perimeterR(length, width);
        System.out.println("The perimeter is :: " + rectangle.perimeterR(length, width));
    }
}