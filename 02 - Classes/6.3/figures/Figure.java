package figures;
import java.awt.Graphics;

public class Figure {
	int x, y;
        int w, h;
	private Color contorno;
        private Color fundo;
	
    public abstract void paint (Graphics g);
}
