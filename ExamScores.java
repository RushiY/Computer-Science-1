import java.util.Scanner;
public class ExamScores
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter grades: \n");
        int userInput = 0;
        int amount = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        
        while(userInput != -1)
        {
            userInput = key.nextInt(); 
            amount++;
            
            if(userInput >= 90)
            {
                a++;
            }
            else if(userInput >= 80)
            {
                b++;
            }
            else if(userInput >= 70)
            {
                c++;
            }
            else if(userInput >= 60)
            {
                d++;
            }
            else
            {
                f++;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("        Summary Report       ");
        System.out.println("=============================");
        System.out.println("\nTotal number of grades = " + (a+b+c+d+f-1));
        System.out.println("Number of A's: " + a);
        System.out.println("Number of B's: " + b);
        System.out.println("Number of C's: " + c);
        System.out.println("Number of D's: " + d);
        System.out.println("Number of F's: " + (f-1));
        
    }
}