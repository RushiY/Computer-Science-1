import java.util.Scanner;
public class NIM100
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
       
        boolean keepPlaying = true;
        String pile = "";
        int amount = 0;
        int endA = 3;
        int endB = 3;
        int endC = 3;
        int player1a = 0;
        int player2a = 1;
        System.out.print("Enter player one's name: ");
        String player1 = key.nextLine();
        System.out.print("Enter player two's name: ");
        String player2 = key.nextLine();
       
        String pileA = "***";
        // index        0123
        String pileB = "***";
        String pileC = "***";
       
       
        do
        {
            if(player1a < player2a)
            {
            System.out.println("\n" + player1 + "'s turn: ");
            System.out.println("A: " + pileA + "\nB: " + pileB + "\nC: " + pileC);
           
            System.out.print("Choose a pile: ");
            pile = key.next();
            System.out.print("How many would you like to take: ");
            amount = key.nextInt();
            if(pile.equalsIgnoreCase("A"))
            {
                pileA = (pileA.substring(0,endA-amount));
                endA -= amount;
            }
           
            else if(pile.equalsIgnoreCase("B"))
            {
                pileB = (pileB.substring(0,endB-amount));
                endB -= amount;
            }
            else if(pile.equalsIgnoreCase("C"))
            {
                pileC = (pileC.substring(0,endC-amount));
                endC -= amount;
            }
           
            if(pileA == (pileA.substring(0,0)) && pileB == (pileB.substring(0,0)) && pileC == (pileC.substring(0,0)))
            {
                System.out.println("\n" + player1 + " wins the game! Well Done!");
                keepPlaying = false;
            }
            player1a++;
            }
            else
            {
            System.out.println("\n" + player2 + "'s turn: ");
            System.out.println("A: " + pileA + "\nB: " + pileB + "\nC: " + pileC);
           
            System.out.print("Choose a pile: ");
            pile = key.next();
            System.out.print("How many would you like to take: ");
            amount = key.nextInt();
            if(pile.equalsIgnoreCase("A"))
            {
                pileA = (pileA.substring(0,endA-amount));
                endA -= amount;
            }
           
            else if(pile.equalsIgnoreCase("B"))
            {
                pileB = (pileB.substring(0,endB-amount));
                endB -= amount;
            }
            else if(pile.equalsIgnoreCase("C"))
            {
                pileC = (pileC.substring(0,endC-amount));
                endC -= amount;
            }
           
            if(pileA == (pileA.substring(0,0)) && pileB == (pileB.substring(0,0)) && pileC == (pileC.substring(0,0)))
            {
                System.out.println("\n" + player2 + " wins the game! Well Done!");
                keepPlaying = false;
            }
            player2a++;
            }
        }while(keepPlaying == true);
    }
}