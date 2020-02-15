import java.util.Scanner;
public class BackwardsString
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = key.nextLine();
        
        
        System.out.println(word.substring(0,1));
        System.out.println(word.substring(word.length() - 2, word.length() -1));
        for(int index = word.length()-1; index  >= 0; index--)
        {
           System.out.print(word.charAt(index));
        }
        System.out.println("\n" + word);
    }
}