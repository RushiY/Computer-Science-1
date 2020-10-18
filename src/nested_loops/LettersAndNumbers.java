package nested_loops;
import java.util.Scanner;
public class LettersAndNumbers
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
        for(int c = 1; c <= rows; c++)
        {
            for(int r = rows; r >= c; r--)
            {
                for(int sa = 1; sa <= r; sa++)
                {
                    System.out.print(c2);
                }
                System.out.print(" ");
                if(c2 >= 65 && c2 < 9)
                {
                    c2++;
                }
                else if(c2 >= 90 && c2 < 97)
                {
                    c2 = 65;
                }
                else if(c2 >= 97 && c2 < 122)
                {
                    c2++;
                }
                else
                {
                    c2 = 97;
                }
            }
            System.out.println();
            c2 = c1.charAt(0);
        }
    }
}