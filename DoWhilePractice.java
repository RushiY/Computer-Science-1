public class DoWhilePractice
{
    public static void main(String [] args)
    {
        int num = 0;
        do 
        {
            System.out.print(num + " ");
            num++;
        }while(num <= 20);
        System.out.println("\n");
        
        num = 1;
        do 
        {
            System.out.print(num + " ");
            num+=2;
        }while(num < 50);
        System.out.println("\n");
        
        num = 0;
        do 
        {
            System.out.print(num + " ");
            num+=10;
        }while(num <= 200);
        System.out.println("\n");
        
        num = 97;
        do 
        {
            System.out.print((char)num + " ");
            num++;
        }while(num <= 122);
    }
}