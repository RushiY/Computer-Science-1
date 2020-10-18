package loops;
import java.util.Scanner;
public class RichterScale
{
    public static void main(String [] args)
    {
        Scanner hhs = new Scanner(System.in);

        System.out.print("Enter a magnitude on the Richter scale ==>> ");
        double mag = hhs.nextDouble();
        String response = "";
        if(mag >= 8.0)
        {
            response = "Damage = Most structures fall";
            System.out.println(response);
        }
        else if(mag >= 7.0)
        {
            response = "Damage = Most buildings destroyed";
            System.out.println(response);
        }
        else if(mag >= 6.0)
        {
            response = "Damage = Many buildings considerably damaged; some collapse";
            System.out.println(response);
        }
        else if(mag >= 4.5)
        {
            response = "Damage = Damage to poorly constructed buildings";
            System.out.println(response);
        }
        else if(mag >= 3.5)
        {
            response = "Damage = Felt by many people, no destruction";
            System.out.println(response);
        }
        else if(mag >= 0)
        {
            response = "Generally not felt by people";
            System.out.println(response);
        }
        else
        {
            response = "This number is not valid";
            System.out.println(response);
        }
    }
}