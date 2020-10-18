package functions;
public class FToC
{
    public void VoidFC(double a)
    {
        double vFC = a-32;
        vFC = vFC * 5/9;
        System.out.println(a + " degrees Fahrenheit == " + vFC + " degrees Celsius");
    }
    public double ReturnFC(double a)
    {
        double rFC = a-32;
        rFC = rFC * 5/9;
        return rFC;
    }
}