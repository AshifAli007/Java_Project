import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener; 

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;
import java.util.Scanner;
public class clock extends Frame implements WindowListener{
    clock(){
        addWindowListener(this);
        setSize(800,800);
        setTitle("🕒🕒 Clock");
        setVisible(true);
        add(new graphics());
    }
    public static void main(String[] args) {
        new clock();
    }
    static class graphics extends Component{
        public void paint(Graphics g){
            double thetas,thetam,thetah;
            thetas = thetam = thetah = 270;
            int radius = 250;
            int xs,xm,xh;
            xs = xm = xh = 300;
            int ys,ym,yh;
            ys = ym = yh = 200;
            
            int seconds = 0;
            int minutes = 0;
            int hour    = 0;
            
             xs = (int) (300 + (radius-15)*Math.cos(Math.toRadians(thetas)));
             ys = (int) (450 + (radius-15)*Math.sin(Math.toRadians(thetas)));
             
             
              xm = (int) (300 + (radius-30)*Math.cos(Math.toRadians(thetam)));
              ym = (int) (450 + (radius-30)*Math.sin(Math.toRadians(thetam)));
              
              
               xh = (int) (300 + (radius-80)*Math.cos(Math.toRadians(thetah)));
               yh = (int) (450 + (radius-80)*Math.sin(Math.toRadians(thetah)));
               
               
               g.setColor( new Color(190, 121, 223));
               Random rand = new Random();
               setBackground(Color.YELLOW);
               g.setFont(new Font("Chiller",Font.BOLD,50));
            while(true){
                
                g.drawOval(50,200,500,500);
                g.drawLine(300,450,xm,ym);
                g.drawLine(300,450,xh,yh);
                if(thetas > 360){
                    thetas = 0;
                }
                if(thetam > 360){
                    thetam = 0;
                }
                if(thetah > 360){
                    thetah = 0;
                }
                xs = (int) (300 + (radius-15)*Math.cos(Math.toRadians(thetas)));
                ys = (int) (450 + (radius-15)*Math.sin(Math.toRadians(thetas)));
                g.drawLine(300,450,xs,ys);
                if(seconds == 60){
                    g.setColor( new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
                    minutes++;
                    thetam +=6;
                    xm = (int) (300 + (radius-30)*Math.cos(Math.toRadians(thetam)));
                    ym = (int) (450 + (radius-30)*Math.sin(Math.toRadians(thetam)));
                    g.drawLine(300,450,xm,ym);
                    seconds = -1;
                }
                if(minutes == 60){
                    hour++;
                      thetah +=30;
                    xh = (int) (300 + (radius-80)*Math.cos(Math.toRadians(thetah)));
                    yh = (int) (450 + (radius-80)*Math.sin(Math.toRadians(thetah)));
                    g.drawLine(300,450,xh,yh);
                    minutes = 0;
                }
                if(hour == 24){
                    hour = 0;
                }
                try    // for delay 
                            {
                                Thread.sleep(50);
                            }
                            catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                            g.clearRect(0,0,799,799);
                            String z= "";
                            System.out.print("Time : ");
                            if(hour<=9){
                               // System.out.print("0");
                                 z += "0";
                            }
                            //System.out.print(hour + " : ");
                            z += hour + " : ";
                            if(minutes<=9){
                              
                                z += "0";
                            }
//                            System.out.print(minutes + " : ");
                            z += minutes + " : ";
                            if(seconds<=9){
                                //System.out.print("0");
                                z += "0";
                            }
//                            System.out.print(seconds);
                            z += seconds;
                            seconds++;
                            thetas +=6;
                            g.drawString("Time :   " + z,200 ,50 );
                            System.out.println(z);
            }
            
            
//            g.drawOval(200, 200, 300, 300);
        }
    }
    
     //windowListener
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
