package classes;
import java.util.Scanner;
public class PythagoreanTherom
{
    public static void main(String[]args)
    {
        Scanner triangle = new Scanner(System.in);
        
        System.out.print("Enter side 1 --> ");
        double a = triangle.nextInt();
        System.out.print("Enter side 2 --> ");
        double b = triangle.nextInt();
        
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("The hypotenuse of the traingle = " + (int)c);
    }
}
