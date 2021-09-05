import java.awt.*;
import java.applet.*;

public class applet2 extends Applet {

    String msg;

    public void init() {
        //set the foreground and background
        setBackground(Color.black);
        setForeground(Color.red);
        msg = "Inside init() --";
    }
    //initialize the string to be displayed
    public void start(){
        msg += " Inside start() --";
    }

    //Display msg in applet window
    public void paint(Graphics g){
        msg += " Inside paint(). ";
        g.drawString(msg,10,30);
    }
}