package data_types;
import java.util.Scanner;
public class Money 
{
    public static void main(String[]args)
    {
        Scanner Money = new Scanner (System.in);
        
        int pennies = 0;
        int nickels = 0;
        int dimes = 0;
        int quarters = 0;
        int totalCents = 0;
        int dollars = 0;
        int cents = 0;
        
        System.out.print("How many pennies do you have --> ");
        int one = Money.nextInt();
        pennies = one;
        
        System.out.print("How many nickels do you have --> ");
        int five = Money.nextInt();
        nickels = five;
        
        System.out.print("How many dimes do you have --> ");
        int ten = Money.nextInt();
        dimes = ten;
        System.out.print("How many quarters do you have --> ");
        
        int twenty_five = Money.nextInt();
        quarters = twenty_five;
        
        
        System.out.println();
        

        totalCents = (quarters * 25) + (dimes * 10) + (nickels * 5) + pennies;
        
        dollars = (totalCents / 100);
       cents = (totalCents % 100);
   


        
        System.out.println("Total value = " + dollars + " dollars and " + cents + " cents ");
       
    }
}
 
