import java.util.Scanner;
public class NumberCompare
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter First Integer --> ");
        int number1 = userInput.nextInt();
        System.out.print("Enter Second Integer --> ");
        int number2 = userInput.nextInt();

        if(number1 > number2)
        {
            System.out.println("Largest == " + number2);
            System.out.println("Smallest == " + number1);
        }
        else
        {
            System.out.println("Largest == " + number2);
            System.out.println("Smallest == " + number1);
        }
    }
}