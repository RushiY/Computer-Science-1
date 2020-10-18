package loops;
import java.util.Scanner;
public class NIM80
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        String pile = "";
        int amount = 0;
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        boolean keepPlaying = true;
        System.out.println("--==* Nim *==--");
        System.out.println("A: " + pileA + " || B: " + pileB + " || C: " + pileC);
        while(keepPlaying == true)
        {
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
            System.out.println("\nA: " + pileA + " || B: " + pileB + " || C: " + pileC);
           
            if(pileA <= 0 && pileB <= 0 && pileC <= 0)
            {
                keepPlaying = false;
                System.out.println("All of the piles are empty! Well Done!");
            }
        }
    }
}