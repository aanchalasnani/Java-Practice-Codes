/*
The following program demonstrate the usage of destroy()
in an applet program 
to permanetly delete the frame window from memory
*/

import java.applet.Applet;
import java.awt.Graphics;

public class applet4 extends Applet {

    StringBuffer strBuffer;
    public void init(){
        strBuffer = new StringBuffer();
        addItem("Initializing the applet ");
    }
    public void start(){
        addItem("Starting the applet ");
    }
    public void stop(){
        addItem("Stopping the applet ");
    }
    public void destroy(){
        addItem("unloading the applet ");
    }
    void addItem(String word){
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }

    public void paint(Graphics g){
        //draw a rectangle around a applet's display area
        g.drawRect(0,0,getWidth()-1,getHeight()-1);
        //display the string inside the rectangle
        g.drawString(strBuffer.toString(),10,20);
    }
}

// <applet code = "applet4.class" width="300" height="200"></applet>