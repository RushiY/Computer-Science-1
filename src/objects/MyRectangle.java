package objects;
public class MyRectangle
{
   // instance variables
   
   private int length;     // rectangle's length
   private int width;      // rectangle's width
   
   // constructor
   
   public MyRectangle(int l, int w)
   {
       length = l;
       width = w;
   }
   
   // accessor methods
   
   public int getLength()
   {
       return length;
   }
   
   public int getWidth()
   {
       return width;
   }
   
   // mutator methods
   
   public void setLength(int l)
   {
       length = l;
    }
   
   public void setWidth(int w)
   {
       width = w;
    }

   // other methods
   
   
   public int getPerimeter()
   {
       int perimeter = (2*length) + (2*width);
       return perimeter;
   }
   
   public int getArea()
   {
       int area = length * width;
       return area;
   }
   
   public String toString()
   {
       String output = "";
       output = "Length: " + getLength() + "\n" + 
       "Width: " + getWidth() + "\n" + "Area: " + getArea() + "\n" + 
       "Perimeter: " + getPerimeter();
       return output;
   }
}