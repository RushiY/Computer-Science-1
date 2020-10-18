package functions;
import java.util.Scanner;
public class SurfaceAreaOfACubeRunner
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the first number --> ");
        SurfaceAreaOfACube s = new SurfaceAreaOfACube();
        int Surface = key.nextInt();
        System.out.println("Void Method :: ");
        s.VoidSA(Surface);
        System.out.println("\nReturn Method :: ");
        System.out.println("The surface area is :: " + s.ReturnSA(Surface));
    }
}