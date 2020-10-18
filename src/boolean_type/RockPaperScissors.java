package boolean_type;
import java.util.Scanner;
import static java.lang.System.*;
public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;

    public RockPaperScissors()
    {
        playChoice = "";
        compChoice = "";
    }

    public String getCompChoice()
    {
        int computerChoice = ((int)(Math.random() * 3) + 0);
        switch(computerChoice)
        {
            case 0:
                compChoice = "R";
                return compChoice;
                //break;
            case 1:
                compChoice = "P";
                return compChoice;
                //break;
            default:
                compChoice = "S";
                return compChoice;
                //break;
        }
    }
   
    public RockPaperScissors(String player)
    {
        player = "";
    }

    public String setPlayers(String playerChoice)
    {
        RPSRunner test = new RPSRunner();
        playChoice = playerChoice;
        return playChoice;
    }

    public String determineWinner(String playerChoice)
    {
        String winner="";
        if((compChoice.equalsIgnoreCase("P") && playerChoice.equalsIgnoreCase("R")) || (compChoice.equalsIgnoreCase("R") && playerChoice.equalsIgnoreCase("S")) || (compChoice.equalsIgnoreCase("S") && playerChoice.equalsIgnoreCase("P")))
        {
            winner = "You Lose!";
        }
        else if((compChoice.equalsIgnoreCase("P") && playerChoice.equalsIgnoreCase("S")) || (compChoice.equalsIgnoreCase("R") && playerChoice.equalsIgnoreCase("P")) || (compChoice.equalsIgnoreCase("S") && playerChoice.equalsIgnoreCase("R")))
        {
            winner = "You Win!";
        }
        else
        {
            winner = "You Tied!";
        }
        return winner;
    }

    public String toString()
    {
        String output="";
        RPSRunner test = new RPSRunner();
        output = "You chose: " + test.playerChoice + "\nComputer Chose: " + getCompChoice() + "\nResult: " + determineWinner(test.playerChoice);
        return output;
    }
}
