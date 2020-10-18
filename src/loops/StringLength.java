package loops;
import java.util.Scanner;
public class StringLength
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter First Word --> ");
        String word1a = userInput.nextLine();
        System.out.print("Enter Second Word --> ");
        String word2a = userInput.nextLine();
        int word1b = word1a.length();
        int word2b = word2a.length();
        if(word1b == word2b)
        {
            System.out.println(word1a + " does have the same # of letters as " + word2a);
        }
        else
        {
            System.out.println(word1a + " does not have the same # of letters as " + word2a);
        }
    }
}