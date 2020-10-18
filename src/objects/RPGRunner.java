package objects;
import java.util.Scanner;
public class RPGRunner
{
    private static Character player;
    private static Scanner key;
   
    public RPGRunner()
    {
      key = new Scanner(System.in);
    }


    public void fight()
    {
        Monster goblin = new Monster();
        System.out.println("\n\n******************************************");
        System.out.println("***** An enraged " + goblin.getName() + " attacks you! *****");
        System.out.println("\n" + player.getName() + " health: " + player.getHealth() + "\t" + goblin.getName()+ " health: " + goblin.getHealth() + "\n");
        while(player.getHealth() > 0 && goblin.getHealth() > 0)
        {
            int pAttack = player.getPower();
            int gAttack = goblin.getPower();
           
            System.out.println(player.getName() + " attacks the " + goblin.getName() + " for " + pAttack + " damage.");
            goblin.setHealth(goblin.getHealth() - pAttack);
            System.out.println(goblin.getName() + " attacks " + player.getName() + " for " + gAttack + " damage.");
            player.setHealth(player.getHealth() - gAttack);
            System.out.println("\n" + player.getName() + " health: " + player.getHealth() + "\t" + goblin.getName() + " health: " + goblin.getHealth());
        }
        if(goblin.getHealth() <= 0)
        {
            System.out.println("******************************************");
            System.out.println(player.getName() + " defeated the " + goblin.getName());
            System.out.println(player.getName() + " gained " + player.gainExperience() + " experience.\n******************************************");
        }
    }

    public void quit()
    {
        System.out.println("\n" + player.getName() + " leaves the dungeon alive.");
        System.out.println("Max level reached: " + player.getLevel());
    }
   

    public static void main(String args[])
    {
        RPGRunner rpg = new RPGRunner();
        String name;
        System.out.print("Enter a character name: ");
        name = key.nextLine();
        player = new Character(name);
       
        System.out.println("\n" + player);

        int choice;
        do {
            System.out.println("\n\n========Game Menu========");
            System.out.println("1. Display Character Stats");
            System.out.println("2. Fight Monster");
            System.out.println("3. Leave dungeon");

            System.out.print("Enter your choice (1-3): ");
            choice = key.nextInt();

            if (choice == 1)
                System.out.println(player);
            else if (choice == 2)
                rpg.fight();
            else if (choice == 3)
                rpg.quit();


            if (player.getHealth() <= 0)
                System.out.println("\nYou lost! Max level reached: " + player.getLevel());



        } while (player.getHealth() > 0 && choice != 3);

        System.out.println("GAME OVER");

    }
}