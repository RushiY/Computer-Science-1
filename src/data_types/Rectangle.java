package data_types;
import java.util.Scanner;
public class Rectangle 
{
    public static void main(String[] args)
    {
        Scanner rectangle = new Scanner(System.in);
        int perimeter;
        int area;

        System.out.print("Enter the Length --> ");
        int length = rectangle.nextInt();
        
        System.out.println("Enter the Width --> ");
        int width = rectangle.nextInt();
        
        area = length * width;
        perimeter = (2 * length) + (2 * width);
        System.out.println();
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
 
