
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashif
 */
public class spiral extends Frame implements WindowListener{
    spiral(){
        setSize(2000,1500);
        addWindowListener(this);
        add(new graphics());
        setTitle("Logarithm Spiral");
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new spiral();
    }
    static class graphics extends Component{
        public void paint(Graphics g){
            int x;
            int y;
            int h = getSize().height;
            int w = getSize().width;
            int theta = 0;
            g.setColor(new Color(254,52,110));
            g.setFont(new Font("Consolas",Font.ITALIC,20));
            g.drawString("x = cos(theta)*pow(a,theta) y = sin(theta)*pow(a,theta)", 110, 200);
            g.setFont(new Font("Algerian",Font.BOLD,50));
                    
                    g.drawString("Logarithmic Spiral Function", 1100, 101);
            while(true){
                    
                    x = (int) (Math.pow(1.0015, theta)*Math.cos(Math.toRadians(theta)));
//                    x = (int) (1.002*Math.cos(Math.toRadians(theta))*Math.pow(Math.E, theta));
                    y = (int) (Math.pow(1.0015, theta)*Math.sin(Math.toRadians(theta)));
//                    y = (int) (1.002*Math.sin(Math.toRadians(theta))*Math.pow(Math.E, theta));
                        g.fillOval(x+w/2, y+h/2-200, 3, 3);
                
                    g.drawString("Plotting > X : "+x+"   Y : " + y,100,100);
                    
                    try    // for delay 
                            {
                                Thread.sleep(10);
                            }
                            catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                            g.clearRect(0,0,950,110);
                            theta++;
            }
                        
        
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //throw ne UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        dispose();
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
