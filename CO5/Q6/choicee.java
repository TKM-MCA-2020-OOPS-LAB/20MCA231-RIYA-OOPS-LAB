
import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
public static void main(String[] args)
{


public class choicee extends Applet implements ItemListener {

    Choice myChoice;

    int rectX;
    int rectY;
    int rectWidth ;
    int rectHeight;
    String shape;
    int Selection; 

    public void init()
    {
        myChoice = new Choice();
        myChoice.addItem("Pick a shape to draw");
        myChoice.addItem("Draw a rectangle");
        myChoice.addItem("Draw a square");
        myChoice.addItem("Draw an circle");
        myChoice.addItem("Draw an triangle");
        add(myChoice);
        myChoice.addItemListener(this);
    }

 public void itemStateChanged (ItemEvent e)
    {
         Selection = myChoice.getSelectedIndex();
         repaint();
    }

 public void paint(Graphics g)
	{
         super.paint(g);

         if (Selection == 1)
         {  
             
             g.drawRect(50,50,100,100);
         }
         if (Selection == 2)
         {
        	 g.drawRect(100,100,50,50);
         }
         if (Selection == 3)
         {
             
             g.drawOval(150,150,100,100);
         }
         if (Selection ==4)
         {
        	 g.drawLine(120, 130, 280, 130);
             g.drawLine(120, 130, 200, 65);
             g.drawLine(200, 65, 280, 130);
         }
	}
}}