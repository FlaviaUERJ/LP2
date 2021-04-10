import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import figures.*;

class ListApp {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Random rand = new Random();
	
    ListFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
		
		
        this.addKeyListener (
			new KeyAdapter() {
                public void keyPressed (KeyEvent evt) {
					if (evt.getKeyChar() == 'e') 
					
						{
							int x = rand.nextInt(350);
							int y = rand.nextInt(350);
							int w = rand.nextInt(50);
							int h = rand.nextInt(50);
							figs.add(new Ellipse(x,y, w,h,Color.black,Color.pink));
							repaint();  // outer.repaint()
						}
						else if (evt.getKeyChar() == 'r') 
						{
							int x = rand.nextInt(350);
							int y = rand.nextInt(350);
							int w = rand.nextInt(50);
							int h = rand.nextInt(50);
							figs.add(new Rect(x,y, w,h,Color.blue,Color.red));
							repaint();  // outer.repaint()
						}
						else if (evt.getKeyChar() == 't') 
						{
							int x = rand.nextInt(350);
							int y = rand.nextInt(350);
							int w = rand.nextInt(50);
							int h = rand.nextInt(50);
							int x1 = rand.nextInt(350);
							int y1 = rand.nextInt(350);
							int x2 = rand.nextInt(350);
							int y2 = rand.nextInt(350);
							int x3 = rand.nextInt(350);
							int y3 = rand.nextInt(350);
   
							figs.add(new Triangulo(x1,y1,x2,y2,x3,y3,Color.red, Color.yellow));  
							repaint();  // outer.repaint()
						}
                }
            }
        );
	
	this.setTitle("Lista de Figuras");
        this.setSize(350, 350);
    }

    public void paint (Graphics g) 
	{
        super.paint(g);
        for (Figure fig: this.figs) 
		{
            fig.paint(g);
        }
    }
}