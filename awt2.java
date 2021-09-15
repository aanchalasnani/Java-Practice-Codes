


//          PANEL EXAMPLE
import java.awt.*;

class awt2 {

    public static void main(String a[]){
        Frame f1 = new Frame("Frame with Panel ");
        Panel p1 = new Panel();
        f1.resize(200,200);
        
        f1.setBackground(Color.magenta);
        f1.setLayout(null);
        p1.resize(100,100);
        p1.setBackground(Color.cyan);
        
        f1.add(p1);
        f1.show();
    }
}