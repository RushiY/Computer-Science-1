package loops;
import java.util.Scanner;
public class RepeatMenu
{
    public static void main(String [] args)
    {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        
        System.out.println("    Menu    ");
        System.out.println("============");
        System.out.println("1. Dr. Pepper");        
        System.out.println("2. Coke");
        System.out.println("3. Sprite");
        System.out.println("4. 7-UP");
        System.out.println("5. Diet Coke");

        
        Scanner key = new Scanner(System.in);
        System.out.print("Selection: ");
        int userInput = key.nextInt();
        
        do
        {
            if(userInput == one)
        {
            System.out.print(one);
            System.out.println("\nYou have chosen Dr. Pepper");
        }
        else if(userInput == two)
        {
            System.out.print(two);
            System.out.println("\nYou have chosen Coke");
        }
        else if(userInput == three)
        {
            System.out.print(three);
            System.out.println("\nYou have chosen Sprite");
        }
        else if(userInput == four)
        {
            System.out.print(four);
            System.out.println("\nYou have chosen 7-UP");
        }
        else if(userInput == five)
        {
            System.out.print(five);
            System.out.println("\nYou have chosen Diet Coke");
        }else
        {
            
            System.out.println("\n    Menu    ");
            System.out.println("============");
            System.out.println("1. Dr. Pepper");        
            System.out.println("2. Coke");
            System.out.println("3. Sprite");
            System.out.println("4. 7-UP");
            System.out.println("5. Diet Coke");
            System.out.print("\nSelection: ");
            userInput = key.nextInt();
        
        if(userInput == one)
        {
            System.out.print(one);
            System.out.println("\nYou have chosen Dr. Pepper");
        }
        else if(userInput == two)
        {
            System.out.print(two);
            System.out.println("\nYou have chosen Coke");
        }
        else if(userInput == three)
        {
            System.out.print(three);
            System.out.println("\nYou have chosen Sprite");
        }
        else if(userInput == four)
        {
            System.out.print(four);
            System.out.println("\nYou have chosen 7-UP");
        }
        else if(userInput == five)
        {
            System.out.print(five);
            System.out.println("\nYou have chosen Diet Coke");
        }
        }
        }while(userInput != one && userInput != two && userInput != three && userInput != four && userInput != five);
        
    }
}