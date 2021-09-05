import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code = "applet3" width = 300 height=50> </applet>

//create a subclass of Frame

class SampleFrame extends Frame {

    SampleFrame(String title) 
    {
        super(title);
        //create an object to handle window events

        MyWindowAdapter adapter = new MyWindowAdapter(this);
        //register it to receive those events
        addWindowListener(adapter);
    
    }

    public void paint(Graphics g){
        g.drawString("This is in frame window",50,100);
    }
}

class MyWindowAdapter extends WindowAdapter {

    SampleFrame sampleFrame;

    public MyWindowAdapter(SampleFrame sampleFrame)
    {
        this.sampleFrame = sampleFrame;
    }
    public void WindowClosing(WindowEvent we){
        sampleFrame.setVisible(false);
    }
}

public class applet3 extends Applet {

    Frame f;

    public void init() {
        f = new SampleFrame("A frame Window ");
        f.setSize(250,250);
        f.setVisible(true);
    }
    public void start(){
        f.setVisible(true);

    }
    public void stop(){
        f.setVisible(false);
    }
    public void paint(Graphics g){
        g.drawString("This is in applet window",10,20);
    }
}