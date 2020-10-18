package objects;
import java.util.Scanner;

public class Character
{
    //Instance Variables
    private String name;
    private int health;
    private int power;
    private int experience;
    private int level;
   
    //Constructor(s)

    public Character(String theCharacter)
    {
        name = theCharacter;
        health = (int)(Math.random() * 31) + 20;
        power = (int)(Math.random() * 10) + 1;
        experience = 0;
        level = 1;
    }
   
    //Accessors

    public String getName()
    {
        return name;
    }
   
    public int getHealth()
    {
        return health;
    }
   
    public int getPower()
    {
        return (int)(Math.random()*power)+1;
    }
   
    public int getExperience()
    {
        return experience;
    }
   
    public int getLevel()
    {
        return level;
    }
   
    //Mutators

    public int levelUp()
    {
        level++;
        return level;
    }
    //Other Methods
    // XP [20..100]
    public int gainExperience()
    {
        experience += (int)(Math.random() * 81) + 20;
        expLevelCheck();
        return experience;
    }

    //Must use this helper method. Do not modify.
    //Every 100 points of experience the character gains a level.
    private void expLevelCheck()
    {
        if(experience - (100 * level) >= 0)
        {
            levelUp();
            System.out.println("\n" + name + " leveled up: " + level);
        }
    }

    // attak damage [1..power]
    public void setHealth(int newHealth)
    {
        health = newHealth;
    }
   
    //toString

    public String toString()
    {
        return "-=*Character Summary*=-" +
               "\nName: " + name +
               "\nHealth: " + health +
               "\nPower: " + power +
               "\nExperience: " + experience +
               "\nLevel: " + level;
    }
}