package loops;
import java.util.Scanner;
public class CharacterAnalyzer
{
    public static void main(String[] args)
    {
        Scanner original = new Scanner(System.in);
        System.out.print("Enter a letter :: ");
        String input = original.nextLine();
        int output = (int)input.charAt(0);
        
        if (output >= 48)
        {
            if (output <= 57)
            {
                System.out.println(input + " is a number. ASCII == " + output);
            }
        }
        
        if (output >= 65)
        {
            if (output <= 90)
            {
                System.out.println(input + " is a uppercase character. ASCII == " + output);
            }
        }
        
        if (output >= 97)
        {
            if (output <= 122)
            {
                System.out.println(input + " is a lowercase character. ASCII == " + output);
            }
        }
    }
}