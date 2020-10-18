package loops;
import java.util.Scanner;
public class Seasons
{
    public static void main(String [] args)
    {
        Scanner level = new Scanner(System.in);
        
        System.out.print("Enter a season --> ");
        String season = level.nextLine();
        
        if(season.equalsIgnoreCase("winter"))
        {
            System.out.println("\nSeason: Winter");
            System.out.println("  Meteorlogical:");
            System.out.println("    December 1 - Februray 28/29");
            System.out.println("  Astronomical:");
            System.out.println("    Winter Solstice - Spring Equinox");
        }
        else if(season.equalsIgnoreCase("spring"))
        {
            System.out.println("\nSeason: Spring");
            System.out.println("  Meteorlogical:");
            System.out.println("    March 1 - May 31");
            System.out.println("  Astronomical:");
            System.out.println("    Spring Equinox - Summer Solstice");
        }
        else if(season.equalsIgnoreCase("summer"))
        {
            System.out.println("\nSeason: Summer");
            System.out.println("  Meteorlogical:");
            System.out.println("    June 1 - August 31");
            System.out.println("  Astronomical:");
            System.out.println("    Summer Solstice - Fall Equinox");
        }
        else
        {
            System.out.println("\nSeason: Fall");
            System.out.println("  Meteorlogical:");
            System.out.println("    September 1 - November 30");
            System.out.println("  Astronomical:");
            System.out.println("    Fall Equinox - Winter Solstice");
        }
    }
}
