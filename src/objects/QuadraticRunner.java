package objects;
import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
    public static void main( String[] args )
   {
       Scanner key = new Scanner(System.in);
       System.out.print("Enter a :: ");
       int quadA = key.nextInt();
       System.out.print("Enter b :: ");
       int quadB = key.nextInt();
       System.out.print("Enter c :: ");
       int quadC = key.nextInt();
       
       Quadratic test = new Quadratic(quadA,quadB,quadC);
       test.calcRoots();
       test.print();
       
       
       System.out.print("\nEnter a :: ");
       quadA = key.nextInt();
       System.out.print("Enter b :: ");
       quadB = key.nextInt();
       System.out.print("Enter c :: ");
       quadC = key.nextInt();
       test.setEquation(quadA,quadB,quadC);
       test.calcRoots();
       test.print();
       

   }
}