package functions;
public class SlopeOfALine
{
    public void VoidS(double a, double b, double c, double d)
    {        
        double vS = (d-b)/(c-a);
        System.out.println("The slope is :: " + vS);
    }
    public double ReturnS(double w, double x, double y, double z)
    {
        double rS = (z-x)/(y-w);
        return rS;
    }
}