import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

public class sin_cos_function extends Frame implements WindowListener{
    Scanner sc = new Scanner(System.in);
    sin_cos_function(){
        setSize(2000,500);
        setTitle("Graphs");
        setVisible(true);
        addWindowListener(this);
        add(new graphics());
        Frame f1 = new Frame();
        f1.setSize(2000,500);
        f1.setTitle("Cos Function");
        f1.setVisible(true);
        f1.addWindowListener(this);
        f1.add(new graphics1());
    }
    public static void main(String[] args) {
       new sin_cos_function();
    }
    
    class graphics extends Component{
        public void paint(Graphics g){
            int theta = 0;
            int x = 0; 
            int y;
           first:while(true){
                   if(theta ==1500){
                       break;
                   }
                    System.out.println("Theta : "+ theta);
                    y = (int) (100*Math.sin(Math.toRadians(theta)));
                    
//                    y = (int) (100*Math.sin(2*(Math.PI+theta)));//desing maker
//                    y = (int) (500*Math.sin(10*(Math.PI+theta)));//desing makeranother
                    //y = (int) (100*Math.sin(Math.toRadians(theta)));
                    g.fillOval(x+100, y+200, 8, 8);
                  
                    
                    x = x+1;
                    theta++;
                    try    // for delay 
                            {
                                Thread.sleep(5);
                            }
                            catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                }
            System.out.println("Hii I am out");


        }
    }
    class graphics1 extends Component{
        public void paint(Graphics g){
            int theta = 0;
            int x = 0; 
            int y;
                while(theta<1500){
                   
                    
                    y = (int) (100*Math.cos(Math.toRadians(theta)));
                    
//                    y = (int) (100*Math.sin(2*(Math.PI+theta)));//desing maker
//                    y = (int) (500*Math.sin(10*(Math.PI+theta)));//desing makeranother
                    //y = (int) (100*Math.sin(Math.toRadians(theta)));
                    g.fillOval(x+100, y+200, 8, 8);
                  
                    
                    x = x+1;
                    theta++;
                    try    // for delay 
                            {
                                Thread.sleep(5);
                            }
                            catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                }


        }
    }
    
    
    
    
    
    
    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
