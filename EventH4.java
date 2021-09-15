import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class EventH4 extends Applet implements KeyListener {
    String msg = ""; int X=10 , Y =20; //output coordinates

    public void init() {
        addKeyListener(this); requestFocus(); //request input focus
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down");
    }

    public void keyReleased(KeyEvent ke){
        showStatus("Key Up");
    }

    public void keyTyped(KeyEvent ke){
        msg += ke.getKeyChar(); repaint();
    }

    public void paint(Graphics g){ //Display Keystrokes
        g.drawString(msg,X,Y);
    }
}
/*
<applet code = "Keyevents.class" width=300 height=100>
</applet>
*/