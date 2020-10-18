package classes;
public class FlashLight
{
    public static void main(String []args)
    {
        String word = "flashlight";
        // index       0123456789
        String flash = word.substring(0,5);
        String light = word.substring(5,10);
        String ash = word.substring(2,5);
        String flight = word.substring(0,1) + word.substring(5, 10);
        String flag = word.substring(0,1) + word.substring(1,3) + word.substring(7,8);
        String fit = word.substring(0,1) + word.substring(6,7) + word.substring(9,10);
        String high = word.substring(4,5) + word.substring(6,9);
        String gas = word.substring(7,8) + word.substring(2,4);
        String fast = word.substring(0,1) + word.substring(2,4) + word.substring(9,10);
        String shaft = word.substring(3,4) + word.substring(4,5) + word.substring(2,3) + word.substring(0,1) + word.substring(9,10);
        String lights = word.substring(5,10) + "s";
        String lighter = word.substring(5,10) + "er";
        String lightning = word.substring(5,10) + "ning";
        String enlightened = "en" + word.substring(5,10) + "ened";
        
        System.out.println("Part 1");
        System.out.println("=================");
        System.out.println(flash);
        System.out.println(light);
        System.out.println(ash);
        System.out.println(flight);
        System.out.println(flag);
        System.out.println(fit);
        System.out.println(high);
        System.out.println(gas);
        System.out.println(fast);
        System.out.println(shaft + "\n");
        System.out.println("Part 2");
        System.out.println("=================");
        System.out.println(lights);
        System.out.println(lighter);
        System.out.println(lightning);
        System.out.println(enlightened);
    }
}
