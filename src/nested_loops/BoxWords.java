package nested_loops;
import java.util.Scanner;
public class BoxWords
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a word --> ");
        String word = key.nextLine();
        System.out.println("\n" + word);
        String output = "";
        int len = word.length();
        
        
        for(int k = 1; k < word.length()-1; k++)
        {
            output += word.substring(k,k+1);
            for(int i = 1; i < word.length() -1; i++)
            {
                output += " ";
            }
            output += word.substring(len-k-1,len-k)+"\n";
        }
        for(int j = 0; j < word.length(); j++)
        {
            output += word.substring(len-1,len);
            len--;
        }
        System.out.print(output);
}
}
