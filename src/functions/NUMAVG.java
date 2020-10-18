package functions;
public class NUMAVG
{
    public void averageV(double num1, double num2)
    {
        double average = (num1 + num2)/2;
        System.out.println(num1 + " + " +  num2 + " has an average of " + average);
    }
    
    public double averageR(double num1, double num2)
    {
        double average1 = (num1 + num2)/2;
        return average1;
    }
}