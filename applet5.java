/*
this applet creates a thread that scrolls
the message contained in msg right to left
across the applet's window.
*/

import java.awt.*;
import java.applet.*;

public class applet5 extends Applet implements Runnable {

    String msg = "A Simple Moving Banner ";
    Thread t = null;
    int state;
    boolean stopFlag;
    //set colors and initialize thread

    public void init(){

        setBackground(Color.cyan);
        setForeground(Color.red);

    }
    //start Thread
    public void start(){
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    //Entry point for the thread that runs the banner.

    public void run(){

        char ch;

        for(;;){
            try {
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1,msg.length());
                msg += ch;

                if(stopFlag){
                    break;
                }

            }
            catch(InterruptedException e){ }
        }
    }
    //Pause the banner
    public void stop(){
        stopFlag = true;
        t = null;
    }
    //display the banner
    public void paint(Graphics g)
    {
        g.drawString(msg,50,50);
    }
}