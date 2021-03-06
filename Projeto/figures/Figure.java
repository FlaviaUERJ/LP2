package figures;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import ivisible.IVisible;

public abstract class Figure implements IVisible{
    public int x, y;
    public int w, h;
	public Color Contorno, Fundo;

    //public abstract void paint (Graphics g);
    //public abstract boolean contains(MouseEvent evt);
	
	
	
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
	public boolean clicked (int x, int y) {
        return (this.x<=x && x<=this.x+this.w && this.y<=y && y<=this.y+this.h);
    }

}