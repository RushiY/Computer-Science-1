package objects;
public class FarmAnimal
{
    // Instance Variables
    
    private String name;      // The farmer's name
    private int cows;         // number of cows
    private int horses;       // number of horses
    private int pigs;         // number of pigs
    private int chickens;     // number of chickens
    
    // Constructors
    
    public FarmAnimal()
    {
        name = "";
        cows = 0;
        horses = 0;
        pigs = 0;
        chickens = 0;
    }
    
    public FarmAnimal(String n, int c, int h, int p, int ch)
    {
        name = n;
        cows = c;
        horses = h;
        pigs = p;
        chickens = ch;
    }
    
    // Accessor Methods
    
    public String getName()
    {
        return name;
    }

    public int getCows()
    {
        return cows;
    }

    public int getHorses()
    {
        return horses;
    }

    public int getPigs()
    {
        return pigs;
    }

    public int getChickens()
    {
        return chickens;
    }
}