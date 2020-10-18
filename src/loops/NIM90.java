package loops;
import java.util.Scanner;
public class NIM90
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        String pile = "";
        int amount = 0;
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        int player1a = 1;
        int player2a = 0;
        boolean keepPlaying = true;
       
        System.out.print("Enter player one's name: ");
        String player1 = key.nextLine();
        System.out.print("Enter player two's name: ");
        String player2 = key.nextLine();
       
       
       
       
        while(keepPlaying == true)
        {
        if(player1a < player2a)
        {
            System.out.println("\n" + player1 + "'s turn");

            System.out.println("\nA: " + pileA + " || B: " + pileB + " || C: " + pileC);
           
            System.out.print("Choose a pile: ");
            pile = key.next();
            System.out.print("How many will you take: ");
            amount = key.nextInt();
            if(pile.equals("A"))
            {
                pileA = pileA - amount;}
           
            else if(pile.equals("B"))
            {
                pileB = pileB - amount;
            }
            else if(pile.equals("C"))
            {
                pileC = pileC - amount;
            }

           
            if(pileA <= 0 && pileB <= 0 && pileC <= 0)
            {
                keepPlaying = false;
                System.out.println(player1 + " wins the game! Well Done!");
            }
            player1a++;
        }
        else
        {
            System.out.println("\n" + player2 + "'s turn");

            System.out.println("\nA: " + pileA + " || B: " + pileB + " || C: " + pileC);
           
            System.out.print("Choose a pile: ");
            pile = key.next();
            System.out.print("How many will you take: ");
            amount = key.nextInt();
            if(pile.equals("A"))
            {
                pileA = pileA - amount;
            }
           
            else if(pile.equals("B"))
            {
                pileB = pileB - amount;
            }
            else if(pile.equals("C"))
            {
                pileC = pileC - amount;
            }

           
            if(pileA <= 0 && pileB <= 0 && pileC <= 0)
            {
                keepPlaying = false;
                System.out.println(player2 + " wins the game! Well Done!");
            }
            player2a++;
        }
        }
    }
}