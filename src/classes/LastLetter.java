package classes;
import java.util.Scanner;
public class LastLetter
{
    public static void main(String [] args)
    {
        System.out.print("Enter a string --> ");
        Scanner text = new Scanner(System.in);
        
        String userInput = text.nextLine();
        System.out.println("Last letter = " + userInput.substring((userInput.length()) -1, (userInput.length()) ));
    }
}
