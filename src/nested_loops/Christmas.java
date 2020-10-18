package nested_loops;
import java.util.*;
public class Christmas
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        for(int d = 1; d <= 12; d++)       // go from 1st day to 12th day
        {

          if(d == 1)
            System.out.println("On the first day of Christmas my true love gave to me");
          if(d == 2)
            System.out.println("On the second day of Christmas my true love gave to me");
          if(d == 3)
            System.out.println("On the third day of Christmas my true love gave to me");
          if(d == 4)
            System.out.println("On the fourth day of Christmas my true love gave to me");
          if(d == 5)
            System.out.println("On the fifth day of Christmas my true love gave to me");
          if(d == 6)
            System.out.println("On the sixth day of Christmas my true love gave to me");
          if(d == 7)
            System.out.println("On the seventh day of Christmas my true love gave to me");
          if(d == 8)
            System.out.println("On the eighth day of Christmas my true love gave to me");
          if(d == 9)
            System.out.println("On the ninth day of Christmas my true love gave to me");
          if(d == 10)
            System.out.println("On the tenth day of Christmas my true love gave to me");
          if(d == 11)
            System.out.println("On the eleventh day of Christmas my true love gave to me");
          if(d == 12)
            System.out.println("On the twelfth day of Christmas my true love gave to me");


          for(int i = 1; i <= 12; i++)   // go from current day down to 1st day
            {
             if(i == 1 && d >= 12)
                System.out.println("twelve drummers drumming,");
             if(i == 2 && d >= 11)
                System.out.println("eleven pipers piping,");   
             
             if(i == 3 && d >= 10)
                System.out.println("ten lords-leeping,");
             if(i == 4 && d >= 9)
                System.out.println("nine ladies dancing,");
             if(i == 5 && d >= 8)
                System.out.println("eight maids a-milking,");
             if(i == 6 && d >= 7)
                System.out.println("seven swans a-swimming,");
             if(i == 7 && d >= 6)
                System.out.println("six geese a-laying,");
             if(i == 8 && d >= 5)
                System.out.println("five gold rings,");
             if(i == 9 && d >= 4)
                System.out.println("four calling birds,");
             if(i == 10 && d >= 3)
                System.out.println("three French hens,");
             if(i == 11 && d >= 2)
                System.out.println("two turtledoves,");
             if(i == 12 && d >= 1)
             {
                if(d>1)
                    System.out.print("and ");
                 System.out.println("a partridge in a pear tree.");
             }
            }
           String pause = keyboard.nextLine();  // pause : Press Enter to continue
        }
    }
}
