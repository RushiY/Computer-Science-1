package data_types;
import java.util.Scanner;
public class Powers 
{
    public static void main(String[] args)
    {
        Scanner Powers = new Scanner(System.in);
        
        System.out.print("Please enter an integer --> " );
        int num1 = Powers.nextInt();
        System.out.println("The Square = " + num1 * num1);
        System.out.println("The Cube = " + num1 * num1 * num1);
        System.out.println("The Fourth Power = " + num1 * num1 * num1 * num1);
    }
}
 
