package inheritance;
import java.awt.*;
import java.applet.*;
public class Fruit
{
    public Fruit(Graphics g, Color c)
    {
        super();
        background(g,c);
    }
   
    private void background(Graphics g, Color c) {
		// TODO Auto-generated method stub
		
	}

	public void greenSkin(Graphics g, Color c)
    {
        int x[] = {810, 186, 173, 840};
        int y[] = {615, 775, 830, 650};
        c = Color.GREEN;
        g.setColor(c);
        g.fillPolygon(x, y, 4);
    }
}
