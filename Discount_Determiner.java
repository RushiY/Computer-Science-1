import java.util.Scanner;

public class Discount_Determiner
{
    public static void main(String[] args)
    {
        int set = 2000;
        Scanner original = new Scanner(System.in);
        System.out.print("Enter the original bill amount :: ");
        int var = original.nextInt();

        if (var >= 2000)
        {
            System.out.print("Bill after discount :: " + (double)var*.85);
        }
        
        else
        {
            System.out.print("Bill after discount:: " + (double)var);
        }
    }
}
      