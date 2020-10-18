package objects;
import java.util.Scanner;
public class SuperHerosRunner
{
        private SuperHeros myHeros;
        private SuperHeros myHeros2;
        public void inputHeros()
        {
            Scanner key = new Scanner(System.in);
           
            System.out.print("\nEnter super hero's name: ");
            String hn = key.nextLine();
            System.out.print("Enter super hero's age: ");
            String a = key.nextLine();
            System.out.print("Main super power: ");
            String p = key.nextLine();
            System.out.print("<Secret> Hero's real name: ");
            String rn = key.nextLine();
            System.out.print("<Secret> Hero's weakness: ");
            String w = key.nextLine();
            System.out.print("\nInclude secret info in profile report? (y/n): ");
            String pr = key.nextLine();
            myHeros = new SuperHeros(hn, a, p, rn, w, pr);


            SuperHerosRunner app = new SuperHerosRunner();
            System.out.println(myHeros);
        }  
       
        public void printHeros()
        {
            Scanner key = new Scanner(System.in);
            SuperHerosRunner app = new SuperHerosRunner();
            boolean idk = true;
            while(idk == true)
            {
            System.out.print("Do you want to enter another? (y/n): ");
            String yes = key.nextLine();
            
            if(yes.equalsIgnoreCase("y"))
            {
                app.inputHeros();
            }
            else
            {
                idk = false;
            }
        }
    }
       
        public static void main(String [] args)
        {
            SuperHerosRunner app = new SuperHerosRunner();
                app.inputHeros();
                app.printHeros();
        }
}