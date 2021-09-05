import java.applet.*;
import java.awt.*;

public class Applet1 extends Applet {

    public void init()
    {
        resize(200,200);
    }

    public void paint (Graphics g) {
        g.drawString("Hello Applet! ",150,150);
    }
}