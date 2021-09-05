import java.applet.*;
import java.awt.*;

public class AppletMsg extends Applet {
    public void init() {
        setBackground(Color.CYAN);
    }
    public void paint(Graphics g){
        int x=0;
        int y=0;
        String msg="";

        x= Integer.parseInt(getParameter("xPosition"));
        y= Integer.parseInt(getParameter("yPosition"));
        msg = getParameter("msg");
        g.drawString(msg,x,y);
    }
}