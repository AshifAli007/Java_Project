import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

public class cubicFunction extends Frame implements WindowListener{
    Scanner sc = new Scanner(System.in);
    cubicFunction(){
        setSize(800,1500);
        setTitle("Working On Graphs 📈📈");
        setVisible(true);
        addWindowListener(this);
        add(new graphics());
    }
    public static void main(String[] args) {
       new cubicFunction();
    }
    
    class graphics extends Component{
        public void paint(Graphics g){
            g.drawOval(100, 100, 200, 200);
            g.drawLine(200,100,200,200); //center = 200,200;
            int r = 100;
            int theta = 0;
            int x1 , y1;
            
            char ch='y';
//            while(true){
//                theta +=1;
//                
//                x1 = (int) (200 + (r)*Math.cos(Math.toRadians(theta)));
//                y1 = (int) (200 + (r)*Math.sin(Math.toRadians(theta)));
//                g.fillOval(x1-5, y1-5, 10, 10);
//                r = r-50;
//                x1 = (int) (200 + (r)*Math.cos(Math.toRadians(-theta)));
//                y1 = (int) (200 + (r)*Math.sin(Math.toRadians(-theta)));
//                g.fillOval(x1, y1, 10, 10);
//                r = r + 50;
//                            try    // for delay 
//                            {
//                                Thread.sleep(2);
//                            }
//                            catch(InterruptedException ex)
//                            {
//                                Thread.currentThread().interrupt();
//                            }
//                g.clearRect(1, 1, 499, 499);
//            }
                
                x1 = -250;
                int change = 1;
                int change_c = -1;
                int c=400 ;
                
                g.setFont(new Font("Times New Roman",Font.ITALIC,40));
                while(true){
                    g.drawString("y = pow(x,3)", 450, 300);
                    if(x1 == 250){
                        change = -1;
                        g.clearRect(1, 1, 800, 1500);
                       
                       
                    }
                    else if(x1 == -250){
                        change = 1;
                        g.clearRect(1, 1, 800  , 1500);
                    }
                    //y1 = (int) (-0.03*(x1-200)*(x1-200) + 400);       //
//                    y1 = (int)(-0.03*(x1 - 200 )*(x1 - 200)  + c);      
//general equation for parabola : y = ax3  + bx2 + cx + d ;  y1 = (-0.03*(x1 - 200)*(x1 - 200)*(x1 - 200) + 2*x1 + 400
//                    y1 = (int) (0.008*(x1)*(x1)*(x1) -4*(x1-300) -900);
                        y1 = (int) (0.00008*x1*x1*x1 - 1.5*x1 + 1);
                    System.out.println("x : " + x1 + "   y1 : " + y1);
                    g.fillOval(x1+300, y1+300, 8, 8);
                    x1 = x1 + change;
                    g.drawString("X : "+x1+"   Y : "+y1,450 , 50);
                             try    // for delay 
                            {
                                Thread.sleep(30);
                            }
                            catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                        //
                        
                        g.clearRect(450, 0,300 ,100);
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
