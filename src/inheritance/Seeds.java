package inheritance;
import java.awt.*;
import java.applet.*;
public class Seeds
{
    public void Seeds(Graphics g)
    {
        drawLeftBottomSeed(g);
        drawMiddleBottomSeed(g);
        drawRightBottomSeed(g);
        drawLeftTopSeed(g);
        drawRightTopSeed(g);
    }
   
    private void drawLeftBottomSeed(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillOval(275, 500, 50, 100);
    }
   
    private void drawMiddleBottomSeed(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillOval(390, 480, 50, 100);
    }
   
    private void drawRightBottomSeed(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillOval(575, 425, 50, 100);
    }
   
    private void drawLeftTopSeed(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillOval(325, 350, 50, 100);
    }
   
    private void drawRightTopSeed(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillOval(400, 250, 50, 100);
    }
}
