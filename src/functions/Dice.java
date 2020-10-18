package functions;
public class Dice
{
    public void printRolls()
    {
        printRoll();
    }
   private void printRoll()
    {
        double random1 = ((Math.random()*6)+1);
        double random2 = ((Math.random()*6)+1);
        double random3 = ((Math.random()*6)+1);
        System.out.println("Roll 1 :: " + (int)random1);
        System.out.println("Roll 2 :: " + (int)random2);
        System.out.println("Roll 3 :: " + (int)random3);    
    }
    
}