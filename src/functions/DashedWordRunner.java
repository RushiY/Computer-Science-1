package functions;
import java.util.Scanner;
public class DashedWordRunner
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        DashedWord s = new DashedWord();
        System.out.print("Enter a word to be dashed: ");
        String word = key.nextLine();
        System.out.println("Void Method :: ");
        System.out.print("Dashed Word: ");
        s.VoidDW(word);
        
        System.out.println("\n\nReturn Method :: ");
        System.out.println("Dashed Word: " + s.ReturnDW(word));
    }
}