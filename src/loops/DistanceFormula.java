package loops;
import java.util.Scanner;
public class DistanceFormula
{
    public static void main(String[] args)
    {
        Scanner original = new Scanner(System.in);
        
        System.out.print("Enter truck A's X coordinate :: ");
        int truckAx = original.nextInt();
        System.out.print("Enter truck A's Y coordinate :: ");
        int truckAy = original.nextInt();
        System.out.print("Enter truck B's X coordinate :: ");
        int truckBx = original.nextInt();
        System.out.print("Enter truck B's X coordinate :: ");
        int truckBy = original.nextInt();
        
        
        double value1a = Math.pow(truckAx,2);
        double value2a = Math.pow(truckAy,2);
        double value1aand2a = value1a + value2a;
        double valueFinaL1a = Math.sqrt(value1aand2a);
        
        double value1b = Math.pow(truckBx,2);
        double value2b = Math.pow(truckBy,2);
        double value1band2b = value1b + value2b;
        double valueFinaL1b = Math.sqrt(value1band2b);
        
        if (valueFinaL1a < valueFinaL1b)
        {
            System.out.println("\nA is closer to (0,0)");
        }
        else
        {
            System.out.println("\nB is closer to (0,0)");
        }
    }
}