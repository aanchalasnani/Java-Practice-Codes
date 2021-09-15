
//          TEXT FIELD EXAMPLE


import java.awt.*;

class awt6 {

    public static void main(String a[]){
        Frame f = new Frame("TextField Example");
        TextField t1,t2;
        t1 = new TextField("Welcome to Nptel ! ");
        t2 = new TextField("Hello");
        t1.setBounds(50,100,200,30); //(xaxis,yaxis,width,height);
        t2.setBounds(50,150,200,30);
        f.add(t1);
        f.add(t2);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}