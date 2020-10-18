package classes;
import java.util.Scanner;
public class MinMax 
{
    public static void main(String [] args)
    {
        Scanner MinMax = new Scanner(System.in);
        System.out.print("Enter 1st Integer --> ");
        int one = MinMax.nextInt();
        System.out.print("Enter 2nd Integer --> ");
        int two = MinMax.nextInt();
        System.out.print("Enter 3rd Integer --> ");
        int three = MinMax.nextInt();
        System.out.println();
        
        int smallest = Math.min(one , two);
        int smallestTwo = Math.min(three , smallest);
        
        int largest = Math.max(one , two);
        int largestTwo = Math.max(three , largest);
        
        System.out.println("Smallest = " + smallestTwo);
        System.out.println("Largest = " + largestTwo);
    }
}
