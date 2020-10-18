package inheritance;
import java.awt.Color;
import java.awt.Graphics;

public class Food
{
    public Food(Graphics g, Color c)
    {
        background(g,c);
    }
   
    public void background(Graphics g, Color c)
    {
        c = new Color(255, 224, 140);
        g.setColor(c);
        g.fillRect(0,0,1000,1000);
    }
}
