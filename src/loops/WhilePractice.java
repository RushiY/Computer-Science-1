package loops;
public class WhilePractice{
    public static void main(String [] args)
    {
        int num = 1;
        while(num <= 25)
        {
            System.out.print(num + " ");
            num++;
        }
        System.out.println("\n\n");
        num = 50;
        while(num <= 70)
        {
            System.out.print(num + " ");
            num++;
        }
        System.out.println("\n\n");
        num = 0;
        while(num <= 100)
        {
            System.out.print(num + " ");
            num = num + 5;
        }
        System.out.println("\n\n");
        num = 20;
        while(num >= 1)
        {
            System.out.print(num + " ");
            num--;
        }
        System.out.println("\n\n");
        num =15;
        while(num >= 1)
        {
            System.out.println("computer");
            num--;
        }
    }
}