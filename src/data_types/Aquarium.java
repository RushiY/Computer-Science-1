package data_types;
import java.util.Scanner;
public class Aquarium{
    public static void main(String[] args)
    {
        final double LITTER_PER_GUPPIE = 5.338474623484662864;
        final double LITTER_PER_TETRA = 2.17474883347482947509;
        final double LITTER_PER_KILLI = 12.539487364819284749;
        final double GAL_PER_LITTER = 0.2641720524;
        Scanner fish = new Scanner(System.in);
        
        
        
        System.out.print("How many Guppies do you have? ");
        int guppies = fish.nextInt();
        
        System.out.print("How many Tetras do you have? ");
        int tetras = fish.nextInt();
        
        System.out.print("How many Killies do you have? ");
        int killies = fish.nextInt();
        System.out.println();
        System.out.println("\\\\\\\\\\\\\\Water Required for Aquarium///////\n");
        
        double guppies_liters = 0;
        double tetras_liters = 0; 
        double killies_liters = 0;
        
        guppies_liters = LITTER_PER_GUPPIE * guppies;
        tetras_liters = LITTER_PER_TETRA * tetras;
        killies_liters = LITTER_PER_KILLI * killies;
        
        System.out.println(guppies_liters + " liters of water for the " + guppies + " guppies.");
        System.out.println(tetras_liters + " liters of water for the " + tetras + " tetras.");
        System.out.println(killies_liters + " liters of water for the " + killies + " killies.\n");
        
        double liters = 0;
        double gallons = 0;
        
        liters = guppies_liters + tetras_liters + killies_liters;
        gallons = GAL_PER_LITTER * liters;
        System.out.println("For a total of " + liters + " litters of water or\n " + "\t\t" + gallons + " gallons (aka American \"freedom\" units)");
    }
}
