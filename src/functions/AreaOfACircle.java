package functions;
public class AreaOfACircle
{
    public void VoidAC(double s)
    {
        double vAC = 3.14159 * Math.pow(s,2);
        System.out.println("The area is :: " + vAC);
    }
    public double ReturnAC(double s)
    {
        double rAC = 3.14159 * Math.pow(s,2);
        return rAC;
    }
}