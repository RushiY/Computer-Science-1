package objects;
import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
    public static void main( String[] args )
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter X1 :: ");
        int x1 = key.nextInt();
        System.out.print("Enter Y1 :: ");
        int y1 = key.nextInt();
        System.out.print("Enter X2 :: ");
        int x2 = key.nextInt();
        System.out.print("Enter Y2 :: ");
        int y2 = key.nextInt();
        Distance test = new Distance(x1, y1, x2, y2);
        test.calcDistance();
        test.print();
        
        System.out.print("\nEnter X1 :: ");
        x1 = key.nextInt();
        System.out.print("Enter Y1 :: ");
        y1 = key.nextInt();
        System.out.print("Enter X2 :: ");
        x2 = key.nextInt();
        System.out.print("Enter Y2 :: ");
        y2 = key.nextInt();
        
        test.setCoordinates(x1,y1,x2,y2);
        test.calcDistance();
        test.print();
    }
}