package loops;
import java.util.Scanner;
public class DigitAdder
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = key.nextInt();
        int sum = 0;
        int num = userInput;
        while(num > 0)
        {
            sum = sum + num % 10;
            num = num / 10;
        }
       
        System.out.println(sum + " is the sum of the digits of " + userInput);
    }
}
