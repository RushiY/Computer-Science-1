package objects;
import java.util.*;

public class RectangleManager
{
   // instance variables
   private MyRectangle rect;
   private Scanner key;

   public RectangleManager()
   {
      key = new Scanner(System.in);
   }

   public void inputDimensions()
   {
       System.out.print("Enter a width: ");
       int w = key.nextInt();
       System.out.print("Enter a length: ");
       int l = key.nextInt();
       
       rect = new MyRectangle(l,w);
   }

   public void changeDimensions()
   {
       System.out.print("Enter a new width: ");
       int w = key.nextInt();
       System.out.print("Enter a new length: ");
       int l = key.nextInt();
       
       rect.setLength(l);
       rect.setWidth(w);
   }

   public void print()
   {
       System.out.println(rect);
   }

   public static void main(String[] args)
   {
       RectangleManager app = new RectangleManager();

       System.out.println("*************************************");
       System.out.println("  Test Constructor and Input Method");
       System.out.println("*************************************");
       app.inputDimensions();
       app.print();

       System.out.println("************************");
       System.out.println("  Test Mutator Method");
       System.out.println("************************");
       app.changeDimensions();
       app.print();
   }
}