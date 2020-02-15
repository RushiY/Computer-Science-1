import java.util.Scanner;
public class Factorial
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = key.nextInt();
        int total = num;
        
        for(int i = num-1; i > 0; i--)
        {
            total = total*i;
        }
        System.out.println("factorial of " + num + " is " + total);
    }
}