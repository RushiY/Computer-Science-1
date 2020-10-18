package classes;
public class QuickPick
{
    public static void main(String[] args)
    {
     System.out.println("Texas Lottery - Quick Pick");   
     System.out.println("===========================");
     int tickets1 = ((int)(Math.random()*50)+1);
     int tickets2 = ((int)(Math.random()*50)+1);
     int tickets3= ((int)(Math.random()*50)+1);
     int tickets4 = ((int)(Math.random()*50)+1);
     int tickets5 = ((int)(Math.random()*50)+1);
     int tickets6 = ((int)(Math.random()*50)+1);
     
     System.out.println(tickets1 + " " + tickets2 + " " + tickets3 + " " + tickets4 + " " + tickets5 + " " + tickets6);
    }
}
