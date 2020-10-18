package loops;
import java.util.Scanner;
public class Table
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter table length --> ");
        int userInput = key.nextInt();
        System.out.println("\n\n  N  10N   100N   1000N");
        System.out.println("------------------------");
        int tableLength = 0;
        int N = 1;
        int ten = 10;
        int hundred = 100;
        int thousand = 1000;
       
        do
        {
            System.out.println("  " + N + "  " + ten + "    " + hundred + "    " +thousand);
            N++;
            ten += 10;
            hundred += 100;
            thousand += 1000;
            tableLength++;
        }while(userInput != tableLength);
    }
}