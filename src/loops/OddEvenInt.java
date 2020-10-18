package loops;
import java.util.Scanner;

public class OddEvenInt
{
    public static void main(String[] args)
    {
        Scanner original = new Scanner(System.in);
        System.out.print("Enter a integer number :: ");
        int input = original.nextInt();
        
        if (input % 2 == 1)
        {
            System.out.println(input + " is odd :: true");
            System.out.println(input + " is even :: false");
        
        }
        else
        {
            System.out.println(input + " is odd :: false");
            System.out.println(input + " is even :: true");
        }
    }
}
