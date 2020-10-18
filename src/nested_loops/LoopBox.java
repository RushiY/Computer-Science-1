package nested_loops;
import java.util.Scanner;
public class LoopBox
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size: ");
        int rows = s.nextInt();
        String c1 = "#";
        char c2 = c1.charAt(0);
        
        //char c = s.nextLine().charAt(0); //method chaining
        
        String output = "";
        if(rows == 1)
        {
            System.out.print("*");
        }
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = rows - 1; j > i; j--)
            {
                output = output + "*";
            }
            for(int k = 0; k <= i; k++)
            {
                output += c2;
            }
            output += "\n";
        }
        
        
        System.out.println(output);
    }
}