package figures;
import java.awt.Graphics;

public class Figure {
	int x, y;
        int w, h;
	int x1, y1, x2, y2, x3, y3;
	private Color contorno;
        private Color fundo;
	
    public abstract void paint (Graphics g);
}
