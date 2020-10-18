package classes;
import java.awt.*;
import java.applet.*;

public class SmileyFace extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow); // Face
        g.fillOval(200, 200, 400, 400);
        
        g.setColor(Color.white); // Eyes
        g.fillOval(250, 300, 100, 100);
        g.fillOval(450, 300, 100, 100);
        
        g.setColor(Color.black); // Pupils
        g.fillOval(260, 335, 50, 50);
        g.fillOval(460, 335, 50, 50);
        
        g.setColor(Color.black); // Bottom part of hat
        g.fillRect(255, 210, 290, 50);
        
        g.setColor(Color.red); // Middle part of hat
        g.fillRect(285, 185, 230, 25);
        
        g.setColor(Color.black); // Top part of hat
        g.fillRect(285, 80, 230, 105);
        
        g.setColor(Color.red); // Tongue
        g.fillArc(375, 485, 50, 75, 0, -180);
        
        g.setColor(Color.black); // Smile
        g.drawArc(300, 422, 200, 100, 0, -180);
        
        g.setColor(Color.black); // Line on tongue
        g.drawLine(400, 523, 400, 550);
        
        Font myFont = new Font("Lucida Calligraphy", Font.BOLD, 32); // Text at bottom
        g.setFont(myFont);
        g.drawString("Have a nice day", 250, 650);
    }
}

 
