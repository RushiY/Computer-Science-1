package classes;
import java.util.Scanner;
public class Replace
{
    public static void main(String [] args)
    {
        System.out.print("Enter a string --> ");
        Scanner text = new Scanner(System.in);
        char find = 'a';
        
        String userInput = text.nextLine();
        System.out.println(userInput.substring(0, userInput.indexOf(find)) + "*" + userInput.substring(userInput.indexOf(find) +1) );
        
        // Find first a
        // Change first a to *
        // Print *
    }
}
