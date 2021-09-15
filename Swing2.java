import javax.swing.*;
public class Swing2 {
    Swing2(){
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("D:\\icon.png")); // here image not provided by me
        b.setBounds(100,100,100,40); 
        f.add(b); 
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {

        new Swing2();
    }
}