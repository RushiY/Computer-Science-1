package inheritance;
import java.awt.*;
import java.applet.*;
public class WatermelonRunner extends Applet
{
    public void paint(Graphics g)
    {
        Watermelon test = new Watermelon(g, new Color(255, 224, 140)); // Passes color to watermelon
    }
}
