package classes;
import java.util.Scanner;

public class Acronym
{
    public static void main(String []args)
    {
        Scanner hero = new Scanner (System.in);
        
        System.out.print("Enter 3 words --> ");
        String word1 = hero.next();
        String word2 = hero.next();
        String word3 = hero.next();
        
        word1 = word1.substring(0,1);
        word2 = word2.substring(0,1);
        word3 = word3.substring(0,1);
        
        System.out.println(word1 + word2 + word3);
    }
}
