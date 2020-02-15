import java.util.Scanner;
public class RepeatWords
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        int wordCount = 0;
        String word = "";
        System.out.println("Enter words, type (stop or exit) to stop: \n");
        while(!word.equals("stop") && !word.equals("exit") )
        {
            word = key.nextLine(); 
            wordCount++;
        }
        
        System.out.println("\nYou entered " + (wordCount-1) + " words.");
    }
}