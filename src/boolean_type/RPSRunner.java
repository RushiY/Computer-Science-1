package boolean_type;
import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
    public static String playerChoice;
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        RockPaperScissors game = new RockPaperScissors();  
        String response = "y";
        System.out.print("Type in your prompt [R,P,S] :: ");
        playerChoice = keyboard.nextLine();
        System.out.println(game.toString());
        //add in a do while loop after you get the basics up and running
        do
        {
            System.out.print("\nDo you want to play again? ");
            response = keyboard.nextLine();
            if(response.equalsIgnoreCase("Y"))
            {
                System.out.print("Type in your prompt [R,P,S] :: ");
                playerChoice = keyboard.nextLine();
                System.out.println(game.toString());
            }
            else
            {
                break;
            }
        }while(response.equalsIgnoreCase("y"));
        String player = "";
    }
}
