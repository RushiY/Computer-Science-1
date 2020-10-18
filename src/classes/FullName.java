package classes;
import java.util.Scanner;
public class FullName
{
    public static void main(String []args)
    {
        Scanner hero = new Scanner (System.in);
        
        System.out.print("Enter your first name --> ");
        String name = hero.nextLine();
        
        System.out.print("Enter in an last name --> ");
        String name1 = hero.nextLine();
        
        System.out.println(name1 + ", " + name);
    }
}
