package loops;
import java.util.Scanner;
public class Digits
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number --> ");
        int userInput = key.nextInt();
        int num = userInput;
        int digit = 0;

        do
        {
            num = num / 10;
            digit++;
        }while(num != 0);
       
        System.out.println("\nDigit Count = " + digit);
        System.out.println("\nDigits");
        System.out.println("------");
        int num1 = userInput;
       
        do
        {
            System.out.println(num1 % 10);
            num1 = num1 / 10;
        }while(num1 != 0);
    }
}
