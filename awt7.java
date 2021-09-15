


//     TEXT AREA EXAMPLE


import java.awt.*;

class awt7 {

    awt7(){
        Frame f = new Frame("Text Area Example");
        TextArea area = new TextArea("Welcome Here !");
        area.setBounds(50,50,300,300);
        f.add(area);
        f.setBackground(Color.gray);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]){

        new awt7();
    }
}