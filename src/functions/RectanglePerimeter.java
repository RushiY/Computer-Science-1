package functions;
public class RectanglePerimeter
{
         public void perimeterV(int len, int wid)
         {
             int perimeter = (2*len) + (2*wid);
             System.out.println("The perimeter is :: " + perimeter);
         }
         
         public int perimeterR(int len, int wid)
         {
             int perimeter = (2*len) + (2*wid);
             return perimeter;
         }
}

