package figures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;



public class Lozenge extends Figure {
	
    
    public Lozenge (int x, int y, int w, int h, Color Contorno, Color Fundo) {
    	super();
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.Contorno = Contorno;
        this.Fundo = Fundo;
		
    }
    
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(this.Contorno);
        g2d.rotate(Math.toRadians(45), this.x+this.w/2, this.y+this.h/2);
        g2d.drawRect(this.x, this.y, this.w, this.w);
        g2d.setColor(this.Fundo);
        g2d.fillRect(this.x, this.y, this.w, this.w);
        g2d.rotate(Math.toRadians(-45), this.x+this.w/2, this.y+this.h/2);
    }

	@Override
	public boolean contains(MouseEvent evt) {
		// TODO Auto-generated method stub
		
		//if (this.l.contains(evt.getPoint()))
            return true;
       // return false;
	}

	@Override
	public void colorFig(Color b) {
		// TODO Auto-generated method stub
		
		
	}


}
