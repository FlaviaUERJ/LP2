
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import figures.Ellipse;
import figures.Figure;
//import figures.Lozenge;
import figures.Pentagono;
import figures.Rect;
import figures.Triangulo;

public class ListApp{
    public static void main(String[] args) {
        ListFrame frame=new ListFrame();
        frame.setVisible(true);
    }
    
}
class ListFrame extends JFrame {
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Point position;
    Random rand = new Random();
    Figure focus = null;	
    Color c = null;
	
	  
    ListFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
            //Listener para o foco do mouse. Onde o mouse estiver posicionado ao clicar a tecla 
			//correspondente a uma figura geométrica ela será criada
            this.addMouseListener (
            new MouseAdapter() {
                 public void mousePressed (MouseEvent evt) {
					 
                    position = getMousePosition();
					
			 if (focus != null) {
                        focus.Contorno = c;
                         }
					
		         focus=null;
			for (Figure fig: figs) {
                        	if (fig.contains(evt)) {
                          		focus = fig;
                            		c = focus.Contorno;
						
                        }

                    		}				
					
                    if (focus != null) {
                     focus.Contorno=c;
		     	if(focus.Contorno != Color.green){
                            focus.Contorno = Color.red;
                        }
			figs.remove(focus);
                        figs.add(focus);
						
                    }
		    repaint();
                }
            }
            );
			
			//Listener arrastar imagens com mouse 
            this.addMouseMotionListener (
                new MouseMotionAdapter() {
                    public void mouseDragged (MouseEvent evt) {
	
		    	Point mousePressedPos=  evt.getPoint();
                      	focus.drag(evt.getX() - position.x, evt.getY() - position.y, mousePressedPos);
                      	position = getMousePosition();
                      	repaint();
                        
                    }
                }
            );
          
		  //Listener interação Teclado
          this.addKeyListener (
            new KeyAdapter() {

                public void keyPressed (KeyEvent evt) {
					 Point position = getMousePosition();
					 int w = 80;
                     int h = 60;
                  int keyCode = evt.getKeyCode();
				  
				  
                    //Aqui são criadas as figuras//
					if (evt.getKeyChar() == 'e') {
						
						figs.add(new Ellipse(position.x,position.y,w,h,Color.white,Color.cyan ));
						
						} else if(evt.getKeyChar() == 'p'){
						figs.add(new Pentagono(position.x,position.y,w,h,Color.white,Color.yellow ));
						
						}else if(evt.getKeyChar() == 't'){		
						figs.add(new Triangulo(position.x,position.y,w,h,Color.cyan,Color.white));
												
                    	}else if(evt.getKeyChar() == 'r'){		
						figs.add(new Rect(position.x,position.y,w,h,Color.black, Color.green )); 
						
						}
						//deu erro tirei
						//else if(evt.getKeyChar() == 'l'){	
						//figs.add(new Lozenge(position.x,position.y,w,h,Color.cyan, Color.yellow ));
											
      
					 //}
					 
					     //limpa a tela do Jframe
				           else if (evt.getKeyCode() == 67) { 
                           figs.clear();    
						}
                
					
					    //locomove as formas geometricas na tela//
					
                          //esquerda
					else if(evt.getKeyCode() == 37){
                    

					for(Figure fig: figs){
						if(focus == fig){
							fig.drag(-1,0,position);
							repaint();

								
						}
					}
				}	
					//cima
					else if(evt.getKeyCode() == 38){
                      		       

					  	 for(Figure fig: figs){
                            				if(focus == fig){
								fig.drag(0 , -1,position);
				
                   						 repaint();
									}
						}
					}

					//direita
					else if(evt.getKeyCode() == 39){
                      		

					  	 for(Figure fig: figs){
                            				if(focus == fig){
								fig.drag(1,0,position);
                    						repaint();

								
								}
						}
					}
					
					//baixo
					else if(evt.getKeyCode() == 40){
                     

					  	 for(Figure fig: figs){
                            				if(focus == fig){
					        	 fig.drag(0,1,position);
		
							}
						}
					}
					               
				//deleta a figura da tela//
				else if(evt.getKeyCode() == KeyEvent.VK_DELETE && focus!=null){
                            		figs.remove(focus);
                            		focus=null;
                    }				
                    repaint();
                    

                }
            }
        );
    

        this.setTitle("Lista de Figuras Geometricas");
        this.setSize(600, 600);
    }

    public void paint (Graphics g) {
        super.paint(g);	
		
        for (Figure fig: this.figs) {
            fig.paint(g);
        }

	
		
		
		
    }
}

