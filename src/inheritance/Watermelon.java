package inheritance;
import java.awt.*;
import java.applet.*;
public class Watermelon
{
    public Watermelon(Graphics g, Color c)
    {
        super(); //the color in watermelon runner is c
        background(g,c);
        greenSkin(g,c);
        setBaseColor(g,c);
        setTopTipHighlights(g,c);
        setLeftBottomHighlights(g,c);
        setRightBottomHighlights(g);
        Seeds s = new Seeds();
        s.Seeds(g);
        WhiteUnEdibleFood w = new WhiteUnEdibleFood();
        w.WhiteUnEdibleFood(g);
    }
   
    private void greenSkin(Graphics g, Color c) {
		// TODO Auto-generated method stub
		
	}

	private void background(Graphics g, Color c) {
		// TODO Auto-generated method stub
		
	}

	public void setBaseColor(Graphics g, Color c)
    {
       //RED EDIBLE STUFF OF WATERMELON
       int x[]= {350,773,197}; //X POINTS
       int y[] = {50,570,725}; //Y POINTS
       c = Color.RED;
       g.setColor(c); //SETTING COLOR OF POLYGON TO RED
       g.fillPolygon(x,y,3); // X, Y, # OF POINTS
    }
   
    public void setTopTipHighlights(Graphics g, Color c)
    {
       //TOP TIP HIGHLIGHTS
        //Object to hold data types like int,double
        //Class of int and double somewhere, but for ease of acces
       int a[]= {350,311, 325, 345, 340, 350, 360, 390, 420, 425, 492}; //X POINTS
       int b[]= {50, 220, 215, 260, 345, 340, 320, 300, 280, 270, 225}; //Y POINTS
       c = new Color(255, 117, 117);
       g.setColor(c); //SETTING COLOR OF POLYGON TO PINKISH RED
       g.fillPolygon(a, b, 11); // X, Y, # OF POINTS
    }
   
    public void setLeftBottomHighlights(Graphics g, Color c)
    {
      //LEFT BOTTOM HIGHLIGHTS
      int e[] = {311, 325, 345, 340, 350, 360, 375, 350, 355, 375, 425, 450, 470, 475, 460, 400, 400, 420, 460, 500, 575, 773, 197}; //X POINTS
      int f[] = {220, 215, 260, 345, 340, 340, 375, 420, 440, 450, 450, 455, 500, 525, 550, 600, 615, 640, 645, 625, 600, 570, 725}; //Y POINTS
      c = new Color(237,71,88);
      g.setColor(c); //SETTING COLOR OF POLYGON TO A WEIRD COLOR IN BETWEEN PINK AND RED
      g.fillPolygon(e, f, 23); // X, Y, # OF POINTS    
    }
   
    public void setRightBottomHighlights(Graphics g)
    {
        //It is just the base color as it is darker than the other parts
    }
}