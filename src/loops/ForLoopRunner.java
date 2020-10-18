package loops;
import java.util.Scanner;
public class ForLoopRunner
{
    public static void main(String[]args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Start: ");
        int start1 = key.nextInt();
        
        System.out.print("Stop: ");
        int stop1 = key.nextInt();
        
        System.out.print("Increment: ");
        int increment1 = key.nextInt();
        
        System.out.println("\nStart " + start1 + " : " + "Stop " + stop1 + " : " + "Increment " + increment1);
        
        for(int i = start1; i <= stop1; i = i + increment1)
        {
            System.out.print(i+" ");
        }
    }
}