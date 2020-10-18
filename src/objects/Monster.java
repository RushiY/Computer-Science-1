package objects;
public class Monster
{
    //Instance Variables

    private String name;
    private int health;
    private int power;
   
    //Construtor(s)

    public Monster()
    {
        name = "goblin";
        power = (int)(Math.random() * 6) + 0;
        health = (int)(Math.random() * 9) + 2;
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
        power = (int)(Math.random() * 6) + 0;
        return power;
    }
   
    //Mutators

    public void setHealth(int newHealth)
    {
        health = newHealth;
    }
   
    public int attack()
    {
        power = (int)(Math.random() * 6) + 0;
        return power;
    }

    //Other Methods
}