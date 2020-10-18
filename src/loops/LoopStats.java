package loops;
import java.util.Scanner;
public class LoopStats
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = key.nextInt();
        System.out.print("Enter a number: ");
        int num2 = key.nextInt();
        
        int even = 0;
        int odd = 0;
        int total = 0;
        
        // Figure out number in between num1 and num2
        // Add those numbers together
        for(int i = num1; i <= num2; i++)
        {
                total += i;
        }
        
        
        for(int i = num1; i <= num2; i++)
        {
            if(i % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }

        }
        System.out.println("Total: " + total);
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}