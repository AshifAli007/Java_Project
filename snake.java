import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener; 
import java.util.concurrent.TimeUnit;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;  
import java.util.logging.Level;
import java.util.logging.Logger;
public class snake extends Frame implements WindowListener ,KeyListener{

    snake(){
        addWindowListener(this);
        addKeyListener(this);
        add(new CustomPaintComponent());
        setSize(500,500);
        setTitle("🚀🚀 Learning Arc");
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new snake(); 
    }
    
    static class CustomPaintComponent extends Component {
 
            public void paint(Graphics g) {
               int x = 0;
               int y = 0;
               int w = getSize().width-1;
               int h = getSize().height-1;
//               g.drawLine(x,y,w,h);
//               g.drawString("Hii There", 100, 100);
//               g.fillRoundRect(100,100,50,50,10,50)

                       for(int i=0;;i++){
                            
                            
                            g.drawArc(220, 220, 60,60,-180-i,180);
                            g.drawArc(200, 200, 100,100,-90+i,180);
                            g.drawArc(180, 180, 140,140,0-i,180);
                            g.drawArc(160,160, 180,180,90+i,180);
                            g.drawArc(140,140, 220,220,180-i,180);
                            g.drawArc(120, 120, 260,260,0+i,180);
                            try    // for delay 
                            {
                                Thread.sleep(50);
                            }
                            catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                            g.clearRect(0,0,w,h); //clearing screen for every itereation
                  
                       }

                
            }
    }
    
    
    
    
    
    
    
    
    
    /*************************Listeneres goes here*******************************************************************/
        
    
    
       public void keyReleased(KeyEvent e){
                    
            }
            public void keyPressed(KeyEvent e){
              if(e.getKeyCode()==40){
                     System.out.println("down key Realesed");
               }
              else if(e.getKeyCode()==37){
                     System.out.println("Left Key Pressed");
               }
              else if(e.getKeyCode()==39){
                     System.out.println("Right Key Pressed");
               }
              else if(e.getKeyCode()==38){
                     System.out.println("Up Key Pressed");
               }
            }

            public void keyTyped(KeyEvent e){

            }
    
    
    
    
    
        public void windowActivated(WindowEvent arg0) {  
        System.out.println("activated");  
        }  
        public void windowClosed(WindowEvent arg0) {  
            System.out.println("closed");  
        }  
        public void windowClosing(WindowEvent arg0) {  
            System.out.println("closing");  
            dispose();  
        }  
        public void windowDeactivated(WindowEvent arg0) {  
            System.out.println("deactivated");  
        }  
        public void windowDeiconified(WindowEvent arg0) {  
            System.out.println("deiconified");  
        }  
        public void windowIconified(WindowEvent arg0) {  
            System.out.println("iconified");  
        }  
        public void windowOpened(WindowEvent arg0) {  
            System.out.println("opened");  
        }
}
