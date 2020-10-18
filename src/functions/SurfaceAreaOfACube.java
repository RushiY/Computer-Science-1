package functions;
public class SurfaceAreaOfACube
{
    public void VoidSA(int s)
    {
        int vSA = 6*((int) Math.pow(s,2));
        System.out.println("The surface area is :: " + vSA);
    }
    public int ReturnSA(int s)
    {
        int rSA = 6*((int) Math.pow(s,2));
        return rSA;
    }
}