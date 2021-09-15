import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.TextField.*;


public class awt11 extends Applet implements ActionListener {

    TextField one,two,res;
    Button add,sub,mul,div;

    public void init(){

        Label l1 = new Label("First Number : ",Label.RIGHT);
        Label l2 = new Label("Second Number : ",Label.RIGHT);
        Label l3 = new Label("Result : ",Label.RIGHT);

        one = new TextField(5);
        two = new TextField(5);
        res = new TextField(7);


        add = new Button("Add");
        sub = new Button("Subtract");
        mul = new Button("Multiply");
        div = new Button("Divide");


        add(l1);
        add(one);
        add(l2);
        add(two);
        add(l3);
        add(res);


        add(add);
        add(sub);
        add(mul);
        add(div);

        one.addActionListener(this);
        two.addActionListener(this);
        res.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);



    }

    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        float b1,b2,b3=0;
        String msg;

        b1 = Float.parseFloat(one.getText());
        b2 =  Float.parseFloat(two.getText());

        if(str.equals("Add")){
            b3=b1+b2;
        }
        if(str.equals("Subtract")){
            b3=b1-b2;
        }
        if(str.equals("Multiply")){
            b3=b1*b2;
        }
        if(str.equals("Divide")){
            b3=b1/b2;
        }
        msg = String.valueOf(b3);
        res.setText(msg);
        repaint();


    }

    public void paint(Graphics g){

    }
}
/*
<applet code = "awt11.class" width=160 height = 160 ></applet>
*/