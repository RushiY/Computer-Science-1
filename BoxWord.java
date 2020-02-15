import java.util.Scanner;
public class BoxWord
{
    public static void main(String[]args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = key.nextLine();
        
        for(int i = 0; i <= (word.length() - 1); i++)
        {
            System.out.println(word);
        }
    }
}