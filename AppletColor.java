import java.applet.*;
import java.awt.*;

public class AppletColor extends Applet {

    public void init() {
        setBackground(Color.CYAN);
    }

    public void paint(Graphics g){
        g.drawString("Applet Background Example  ",0,50);
    }

}