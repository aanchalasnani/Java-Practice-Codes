


//      LIST EXAMPLE


import java.awt.*;
class awt8 {

    awt8(){

        Frame f1 = new Frame("List Example");
        List l1 = new List(5);
        l1.setBounds(100,100,75,75);

        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");

        f1.add(l1);
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);
        
    }


    public static void main(String args[]){
        new awt8();
    }
}