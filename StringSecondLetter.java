import java.util.Scanner;
public class StringSecondLetter
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter First Word --> ");
        String word1a = userInput.nextLine();
        System.out.print("Enter Second Word --> ");
        String word2a = userInput.nextLine();

        char word1b = word1a.charAt(0);
        char word2b = word2a.charAt(0);
        
        if(word1b == word2b)
        {
            System.out.println(word1a + " has the same first letter as " + word2a);
        }
        else
        {
            if(word1b + 32 == word2b)
        {
            System.out.println(word1a + " has the same first letter as " + word2a);
        }
        else
        {
            if(word1b == word2b + 32)
        {
            System.out.println(word1a + " has the same first letter as " + word2a);
        }
        else
        {
            System.out.println(word1a + " does not have the same first letter as " + word2a);
        }
        }
        }
    }
}