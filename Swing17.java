import javax.swing.*;

public class Swing17 extends JFrame {

    public Swing17() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);

    }

    public static void main(String s[]){
        Swing17 frame = new Swing17();
        frame.pack();
        frame.setVisible(true);
    }
}