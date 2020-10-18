package data_types;
public class Conversion
{
    public static void main (String[] args)
    {
        // The variables for units of conversion factors
        
        double inch = 2.54;
        double yard = 0.9144;
        double mile = 1.609;
        double centimeter = 0.3937;
        double meter = 1.094;
        double kilometer = 0.6214;
        double light_year = 9.464E12;
        
        // The word and display code
        
        System.out.println("       Units and Conversion Factors");
        System.out.println("----------------------------------------------");
        System.out.println("1 inch = " + inch + " centimeters");
        System.out.println("1 yard = " + yard + " meters");
        System.out.println("1 mile = " + mile + " kilometers");
        System.out.println("1 centimeter = " + centimeter + " inches");
        System.out.println("1 meter = " + meter + " yards");
        System.out.println("1 kilometer = " + kilometer + " miles");
        System.out.println("1 light year = " + light_year + " kilometers");
    } 
}
