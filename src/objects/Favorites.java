package objects;
public class Favorites
{
   // instance variables
   
   private String name;          // The peron's name
   private String food;          // Favorite food
   private String color;         // Favorite color
   private String music;          //Favorite music
   private String automobile;    // Favorite automobile
   private String sport;        //  Favorite sport
   
   // constructors
   
   public Favorites(String n, String f, String c, String m, String a, String s)
   {
       name = n;
       food = f;
       color = c;
       music = m;
       automobile = a;
       sport = s;
   }
   
   // toString method
   
   public String toString()
   {
       return "Name: " + name + "\n" +
       "Food: " + food + "\n" +
       "Color: " + color + "\n" +
       "Music: " + music + "\n" +
       "Automobile: " + automobile + "\n" +
       "Sport: " + sport;
   }  
}