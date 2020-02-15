import java.util.Scanner;
public class Largest
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter 10 numbers --> \n\n");
       
        int count = 0;
        int max = 0;
        do
        {
            int userInput = key.nextInt();
            max = Math.max(userInput,max);
            count++;
        }while(count < 10);
        System.out.println("\nThe largest number is: " + max);
    }
}