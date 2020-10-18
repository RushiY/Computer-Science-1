package loops;
public class Averages
{
    public static void main(String [] args)
    {
        int num = 0;
        
        int positive = 0;
        int sumOfP = 0;
     
        int negative = 0;
        int sumOfN = 0;
        
        
        while(num <= 100)
        {
            int randomNums = ((int)(Math.random() * 2000) - 1000);
            System.out.print(randomNums + " ");
            num++;
            
            if(randomNums > 0)
            {
                positive++;
                sumOfP += randomNums;
            }
            else if(randomNums < 0)
            {
                negative++;
                sumOfN += randomNums;
            }
        }
        double avgOfP = (double)sumOfP/positive;
        double avgOfN = (double)sumOfN/negative;
        System.out.println("\n\n      Summary      ");
        System.out.println("-------------------");
        System.out.println("Positive Numbers     = " + positive);
        System.out.println("Sum of Positives     = " + sumOfP);
        System.out.println("Average of Positives = " + avgOfP);
        
        System.out.println("\n");
        
        System.out.println("Negative Numbers     = " + negative);
        System.out.println("Sum of Negatives     = " + sumOfN);
        System.out.println("Average of Negatives = " + avgOfN);
    }
}