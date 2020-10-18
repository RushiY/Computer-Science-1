package loops;
import java.util.Scanner;
public class DecreasingWord
{
    public static void main(String[]args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = key.nextLine();
        int len = word.length();
        
        for(int i = 0; i <= len-1; i++)
        {
            System.out.println((word.substring(0,len -i)));
        }
    }
}