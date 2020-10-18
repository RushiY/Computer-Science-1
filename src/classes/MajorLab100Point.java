package classes;
import java.awt.*;
import java.applet.*;

public class MajorLab100Point extends Applet // Allows to create graphics
{
    public void paint(Graphics g) // telling bluej that g will indicate a graphics is being created
    {
        // Cube
        
        g.drawRect(50, 50, 300, 300); //Outer square
        g.drawRect(100, 100, 300, 300); //Inner square
        g.drawLine(50, 50, 100, 100); // Top-Left diagonal line
        g.drawLine(350, 50, 400, 100); // Top-Right diagonal line
        g.drawLine(50, 350, 100, 400); //Bottom-Left diagonal line
        g.drawLine(350, 350, 400, 400); //Bottom-Right diagonal line
        
        // Sphere
        
        g.drawOval(500, 15, 300, 300); // Vertical (Original Circle)
        g.drawOval(538, 15, 224, 300); // Vertical (1st Oval)
        g.drawOval(576, 15, 148, 300); // Vertical (2nd Oval)
        g.drawOval(614, 15, 72, 300); // Vertical (3rd Oval)
        
        g.drawOval(500, 53, 300, 224); // Horizontal (1st Oval)
        g.drawOval(500, 91, 300, 148); // Horizontal (2nd Oval)
        g.drawOval(500, 129, 300, 72); // Horizontal (3rd Oval)
        
        // Triangle
        
        g.drawLine(300, 625, 900, 625); // Base line
        g.drawLine(600, 325, 900, 625); // Top right line
        g.drawLine(600, 325, 300, 625); // Top left line
        g.drawLine(600, 325, 600, 625); // Center line
        g.drawLine(450, 475, 900, 625); // Left-middle to right-bottom
        g.drawLine(750, 475, 300, 625); //Right-middle to left-bottom

        // Lines
        
        g.drawRect(25, 425, 200, 200); // The box

        int line1_point1_x = ((int)(Math.random()*200) + 25); // Line One
        int line1_point1_y = ((int)(Math.random()*200) + 425);
        int line1_point2_x = ((int)(Math.random()*200) + 25);
        int line1_point2_y = ((int)(Math.random()*200) + 425);
        
        int line2_point1_x = ((int)(Math.random()*200) + 25); // Line Two
        int line2_point1_y = ((int)(Math.random()*200) + 425);
        int line2_point2_x = ((int)(Math.random()*200) + 25);
        int line2_point2_y = ((int)(Math.random()*200) + 425);
        
        int line3_point1_x = ((int)(Math.random()*200) + 25); // Line Three
        int line3_point1_y = ((int)(Math.random()*200) + 425);
        int line3_point2_x = ((int)(Math.random()*200) + 25);
        int line3_point2_y = ((int)(Math.random()*200) + 425);
        
        int line4_point1_x = ((int)(Math.random()*200) + 25); // Line Four
        int line4_point1_y = ((int)(Math.random()*200) + 425);
        int line4_point2_x = ((int)(Math.random()*200) + 25);
        int line4_point2_y = ((int)(Math.random()*200) + 425);
        
        g.setColor(Color.red);
        g.drawLine(line1_point1_x, line1_point1_y, line1_point2_x, line1_point2_y ); // Line One
        g.setColor(Color.blue);
        g.drawLine(line2_point1_x, line2_point1_y, line2_point2_x, line2_point2_y ); // Line Two
        g.setColor(Color.green);
        g.drawLine(line3_point1_x, line3_point1_y, line3_point2_x, line3_point2_y ); // Line Three
        g.setColor(Color.orange);
        g.drawLine(line4_point1_x, line4_point1_y, line4_point2_x, line4_point2_y ); // Line Four
    }
}

 
