package loops;
import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Input a number to be reverse --> ");
        int num = key.nextInt();
        int num1 = num;
        
        System.out.print(num + " reversed is ");
        while(num != 0)
        {
            num %=10;
            num1 /= 10;
            System.out.print(num);
            num = num1;
        }

    }
}