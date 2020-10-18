package nested_loops;
import java.util.Scanner;
public class Patterns
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size: ");
        int rows = s.nextInt();
        String c2 = "*";
        String output = "";
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = rows - 1; j > i; j--)
            {
                output = output + "";
            }
            for(int k = 0; k <= i; k++)
            {
                output += c2;
            }
            output += "\n";
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = rows - 1; j > i; j--)
            {
                output = output + "*";
            }
            for(int k = 0; k <= i; k++)
            {
                output += " ";
            }
            output += "\n";
        }
        
        System.out.println(output);
    }
}