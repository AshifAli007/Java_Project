
import java.awt.Color;
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
public class lituus_spiral extends Frame implements WindowListener{
    lituus_spiral(){
        addWindowListener(this);
        add(new graphics());
        setSize(2000,900);
        setVisible(true);
    }
    public static void main(String[] args) {
        new lituus_spiral();
    }
    static class graphics extends Component{
        public void paint(Graphics g){
            int x;          //x = 100sin(a/b*theta)*cos(theta);
            int y;
            double a = 5;
            double b = 6;
            double theta =0;
            g.setColor(Color.cyan);
            while(true){
                //as theta approaches infinty the curve approaches the origin
                
                   x = (int) (3*1000*(double)(1/Math.sqrt(theta))*Math.cos(Math.toRadians(theta)));//lituus spiral
                   y = (int) -(3*1000*(double)(1/Math.sqrt(theta))*Math.sin(Math.toRadians(theta)));
                         g.fillOval(x+700, y+350, 4, 4);

//                    x = (int) (8*(double)(1*Math.sqrt(theta))*Math.cos(Math.toRadians(theta))); //fermat's Spiral
//                   y = (int) -(8*(double)(1*Math.sqrt(theta))*Math.sin(Math.toRadians(theta)));
//                   System.out.println(theta);
//                g.fillOval(x+700, y+350, 4, 4);
//                
//                x = (int) -(8*(double)(1*Math.sqrt(theta))*Math.cos(Math.toRadians(theta)));
//                   y = (int) (8*(double)(1*Math.sqrt(theta))*Math.sin(Math.toRadians(theta)));
//                   g.fillOval(x+700, y+350, 4, 4);
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
