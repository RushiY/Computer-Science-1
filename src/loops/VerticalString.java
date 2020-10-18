package loops;
import java.util.Scanner;
public class VerticalString
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter a string --> ");
        String word = key.nextLine();
        int len = word.length();
        for(int i = 0; i < word.length(); i++)
        {
            System.out.println(word.substring(i,(i +1)));
        }
    }
}