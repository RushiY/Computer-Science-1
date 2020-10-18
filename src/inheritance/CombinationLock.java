package inheritance;
import java.util.*;
public class CombinationLock extends Lock
{
    //Instance Variables
    private String combination;
    
    //Default Constructor
    public CombinationLock()
    {
        super(); // Calls the default constructor of the lock class
        combination = "";
    }
    
    public CombinationLock(String s)
    {
        super();
        combination = s;
    }
    
    //Mutator Methods
    public void setCombination(String s)
    {
        combination = s;
    }
    
    //Accessor Method
    public String getCombination()
    {
        return combination;
    }
    
    //Other Methods
    @Override
    public void open()
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a combination: ");
        String input = key.nextLine();
        if (input.equals(combination))
        {
            super.open();
        }
        else
        {
            super.close();
        }
    }
    
    //toString Methods
    
    public String toString()
    {
        return super.toString() + 
        "\nCombination: " + combination;
    } 
}