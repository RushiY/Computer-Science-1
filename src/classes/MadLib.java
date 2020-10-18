package classes;
import java.util.Scanner;

public class MadLib
{
    public static void main(String []args)
    {
        Scanner hero = new Scanner (System.in);
        
        System.out.print("[1] Enter a NOUN --> ");
        String a1 = hero.nextLine();
        
        System.out.print("[2] Enter a type of VEHICLE --> ");
        String a2 = hero.nextLine();
        
        System.out.print("[3] Enter an ADJECTIVE --> ");
        String a3 = hero.nextLine();
        
        System.out.print("[4] Enter a ADJECTIVE --> ");
        String a4 = hero.nextLine();
        
        System.out.print("[5] Enter a NOUN --> ");
        String a5 = hero.nextLine();
        
        System.out.print("[6] Enter a NOUN --> ");
        String a6 = hero.nextLine();
        
        System.out.print("[7] Enter a ADJECTIVE --> ");
        String a7 = hero.nextLine();
        
        System.out.print("[8] Enter a VERB --> ");
        String a8 = hero.nextLine();

        System.out.print("[9] Enter a NOUN --> ");
        String a9 = hero.nextLine();
        
        System.out.print("[10] Enter a NOUN --> ");
        String a10 = hero.nextLine();
        
        System.out.print("[11] Enter a NOUN --> ");
        String a11 = hero.nextLine();
        
        System.out.print("[12] Enter a NOUN --> ");
        String a12 = hero.nextLine();
        
        System.out.println();
        System.out.println("         GILLIGAN`S ISLAND THEME");
        System.out.println();
        System.out.println("Just sit right back and you`ll hear a tale,");
        System.out.println("A tale of a fateful " + a1 + ",");
        System.out.println("That started from this tropic port,");
        System.out.println("Aboard this tiny " + a2 + ".");
        System.out.println();
        System.out.println("The mate was a " + a3 + " sailor man,");
        System.out.println("The skipper " + a4 +" and sure.");
        System.out.println("Five " + a5 + " set sail that day,");
        System.out.println("For a three hour " + a6 + ", a three hour " + a6 + ".");
        System.out.println();
        System.out.println("The weather started getting" + a7 + ",");
        System.out.println("The tiny " + a2 + " was " + a8 + ",");
        System.out.println("If not for the " + a9 + " of the fearless crew ,");
        System.out.println("The " + a10 + " would be lost, the " + a10 + "would be lost.");
        System.out.println();
        System.out.println("The " + a2 + " set ground on the shore of this uncharted desert isle,");
        System.out.println("With Gilligan, The Skipper too,");
        System.out.println("The millionaire and his " + a11 + ", The movie " + a12 + ","); 
        System.out.println("And The Rest, Here on Gilligan`s Isle.");
    }
}
