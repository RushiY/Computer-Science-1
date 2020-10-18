package inheritance;
public class Lock
{
    //Instance Variables
    protected boolean locked;
    
    //Default Constructor
    public Lock()
    {
        locked = true;
    }
    
    //Mutator Methods
    public void open()
    {
        locked = false;
    }
    
    public void close()
    {
        locked = true;
    }
    
    //Accessor Methods
    public boolean amILocked()
    {
        return locked;
    }
    
    //toString Methods
    
    public String toString()
    {
        if(locked = false)
        {
            return "Lock: Unlocked";
        }
        else
        {
            return "Lock: Locked";
        }
    }
}