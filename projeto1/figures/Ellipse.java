package figures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;


 public class Ellipse  extends Figure {
    int x, y;
    int w, h;
	Ellipse2D  e;

    public Ellipse (int x, int y, int w, int h,Color Contorno, Color Fundo) {
				 super(x, y,w,h,Contorno,Fundo);

        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
		this.Contorno = Contorno;
		this.Fundo = Fundo;
      this.e = new Ellipse2D.Double(this.x, this.y, this.w, this.h);

    }
	public void colorFig(Color Fundo){
			this.Fundo = Fundo;
		
		}
	
	
	
	 public void paint (Graphics g) {
       Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.Contorno);
        g2d.draw(this.e);
        g2d.setColor(this.Fundo);
        g2d.fill(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
	 }
		
	

	
	 public boolean contains(MouseEvent evt) {
        if (this.e.contains(evt.getPoint()))
            return true;
        return false;
    }
	
	
	
	public void drag(int x,int y, Point p){
        this.x+=x;
        this.y+=y;
        this.e = new Ellipse2D.Double(this.x, this.y, this.w, this.h);
    }
}

