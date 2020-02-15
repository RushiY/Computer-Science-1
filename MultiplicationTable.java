import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Multipling value: ");
        int ValueMulti = key.nextInt();
        System.out.print("# of times multiplied: ");
        int ValueTimes = key.nextInt();
        
        for(int i = 0; i < ValueTimes; i++)
        {
            int multiply = (i+1) * ValueMulti;
            System.out.println((i+1) + " * " + ValueMulti + " = " + multiply);
        }
    }
}