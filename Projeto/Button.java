
import java.awt.Graphics;
import figures.Figure;
import ivisible.IVisible;

public class Button implements IVisible 
{
	public int idx;
	public Figure fig;
	
	public Button(int idx, Figure fig) {
		this.idx = idx;
		this.fig = fig;
		this.x=30;
		this.y=30;
		this.w=30;
		this.h=30;
	}
	
	public boolean clicked(int x, int y) {
		return (fig.x <= x && x <= fig.x + fig.w && fig.y <= y && y <= fig.y + fig.h);
		
	}

	public void paint(Graphics g, boolean focused) {
        
	}

}