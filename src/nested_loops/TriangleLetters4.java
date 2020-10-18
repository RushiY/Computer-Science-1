package nested_loops;
import java.util.Scanner;
public class TriangleLetters4
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size: ");
        int rows = s.nextInt();
        s.nextLine(); // dummy read
        System.out.print("Enter a character: ");
        String c1 = s.nextLine();
        char c2 = c1.charAt(0);
        
        //char c = s.nextLine().charAt(0); //method chaining
        
        String output = "";
        for(int i = rows-1; i >= 0; i--)
        {
            for(int j = rows - 1; j > i; j--)
            {
                output = output + " ";
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