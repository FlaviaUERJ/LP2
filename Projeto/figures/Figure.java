package figures;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

public abstract class Figure {
    public int x, y;
    public int w, h;
	public Color Contorno, Fundo;

    public abstract void paint (Graphics g);
    public abstract boolean contains(MouseEvent evt);
	public abstract void colorFig(Color b);
	
	
    public  Figure (int x, int y, int w, int h, Color Contorno, Color Fundo) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
		this.Contorno = Contorno;
		this.Fundo = Fundo;
    }

	public Figure() {
		// TODO Auto-generated constructor stub
	}

	public void drag (int dx, int dy, Point p) {
        this.x += dx;
        this.y += dy;
    }
		

}
