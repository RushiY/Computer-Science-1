package objects;
import java.util.*;
public class FavoritesManager
{  
   //instance variables
   
   private Favorites myFavorites;
   
   // methods
   public void inputFavorites()
   {
       Scanner keyboard = new Scanner(System.in);

       System.out.print("Enter person's name --> ");
       String n = keyboard.nextLine();
       System.out.print("Enter favorite food --> ");
       String f = keyboard.nextLine();
       System.out.print("Enter favorite color --> ");
       String c = keyboard.nextLine();
       System.out.print("Enter favorite music --> ");
       String m = keyboard.nextLine();
       System.out.print("Enter favorite automobile --> ");
       String a = keyboard.nextLine();
       System.out.print("Enter favorite sport --> ");
       String s = keyboard.nextLine();
       myFavorites = new Favorites(n, f, c, m, a, s);
   }
   
   public void printFavorites()
   {
       System.out.println(myFavorites);
   }
   
   public static void main(String [] args)
   {
       FavoritesManager app = new FavoritesManager();
       app.inputFavorites();
       app.printFavorites();
   }    
}
