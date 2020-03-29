
import java.awt.Component;
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
public class sin_flower extends Frame implements WindowListener{
    sin_flower(){
        addWindowListener(this);
        add(new graphics());
        setSize(900,900);
        setVisible(true);
    }
    public static void main(String[] args) {
        new sin_flower();
    }
    static class graphics extends Component{
        public void paint(Graphics g){
            int x;          //x = 100sin(a/b*theta)*cos(theta);
            int y;
            double a = 5;
            double b = 6;
            double theta =0;
            while(true){
                
                x = (int) (200*Math.sin(Math.toRadians((double)(a/b)*theta))*Math.cos(Math.toRadians(theta)));
                y = (int) (200*Math.sin(Math.toRadians((double)(a/b)*theta))*Math.sin(Math.toRadians(theta)));

//                x = (int) (500*Math.sin(Math.toRadians((a/b)*theta))*Math.cos(Math.PI+theta));
//                y = (int) (500*Math.sin(Math.toRadians((a/b)*theta))*Math.sin(Math.PI+theta));
                g.fillOval(x+300, y+300, 4, 4);
                try    // for delay 
                            {
                                Thread.sleep(7);
                            }
                            catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                            
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
