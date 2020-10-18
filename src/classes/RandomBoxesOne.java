package classes;
import java.awt.*;
import java.applet.*;

public class RandomBoxesOne extends Applet
{
    public void paint(Graphics g)
    {

        g.drawRect(25, 25, 500, 500); // The box

        int square1_point1_x = ((int)(Math.random()*400) + 25); // Square One
        int square1_point1_y = ((int)(Math.random()*400) + 25);
        int square2_point1_x = ((int)(Math.random()*400) + 25); // Square Two
        int square2_point1_y = ((int)(Math.random()*400) + 25);
        
        int square3_point1_x = ((int)(Math.random()*400) + 25); // Square Three
        int square3_point1_y = ((int)(Math.random()*400) + 25);
        int square4_point1_x = ((int)(Math.random()*400) + 25); // Square Four
        int square4_point1_y = ((int)(Math.random()*400) + 25);
        
        int square5_point1_x = ((int)(Math.random()*400) + 25); // Square Five
        int square5_point1_y = ((int)(Math.random()*400) + 25);
        int square6_point1_x = ((int)(Math.random()*400) + 25); // Square Six
        int square6_point1_y = ((int)(Math.random()*400) + 25);
        
        int square7_point1_x = ((int)(Math.random()*400) + 25); // Square Seven
        int square7_point1_y = ((int)(Math.random()*400) + 25);
        int square8_point1_x = ((int)(Math.random()*400) + 25); // Square Eight
        int square8_point1_y = ((int)(Math.random()*400) + 25);
        
        g.setColor(Color.red);
        g.fillRect(square1_point1_x, square1_point1_y, 100, 100 ); // Square One
        g.fillRect(square2_point1_x, square2_point1_y, 100, 100 ); // Square Two
        g.setColor(Color.blue);
        g.fillRect(square3_point1_x, square3_point1_y, 100, 100 ); // Square Three
        g.fillRect(square4_point1_x, square4_point1_y, 100, 100 ); // Square Four
        g.setColor(Color.green);
        g.fillRect(square5_point1_x, square5_point1_y, 100, 100 ); // Square Five
        g.fillRect(square6_point1_x, square6_point1_y, 100, 100 ); // Square Six
        g.setColor(Color.orange);
        g.fillRect(square7_point1_x, square7_point1_y, 100, 100 ); // Square Seven
        g.fillRect(square8_point1_x, square8_point1_y, 100, 100 ); // Square Eight
    }
}
