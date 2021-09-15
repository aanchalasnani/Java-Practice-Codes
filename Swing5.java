import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Swing5 extends JFrame implements ItemListener {
    public static void main(String arg[])
    {
        new Swing5();
    }
        private JToggleButton button;
        Swing5() {
            setTitle("JToggleButton with ItemListener Example");
            setLayout(new FlowLayout());
            setJToggleButton();
            setAction();
            setSize(200,300);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
        private void setJToggleButton()
        {
            button = new JToggleButton("ON");
            add(button);


        }
        private void setAction()
        {
            button.addItemListener(this);
        }
        public void itemStateChanged(ItemEvent eve)
        {
            if(button.isSelected())
            {
                button.setText("OFF");
            }
           else{
                button.setText("ON");
            }
        }
        
    
}