package inheritance;
import java.awt.*;
import java.applet.*;
public class WhiteUnEdibleFood
{
    public void WhiteUnEdibleFood(Graphics g)
    {
        whiteStuff(g);
    }
   
    private void whiteStuff(Graphics g)
    {
        int x[] = {197, 773, 810, 186};
        int y[] = {725, 570, 615, 775};
        g.setColor(new Color(255, 193, 189));
        g.fillPolygon(x, y, 4);
    }
}
