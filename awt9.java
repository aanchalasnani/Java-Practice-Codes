


//      CHOICE EXAMPLE


import java.awt.*;
class awt9 {

    awt9(){

        Frame f1 = new Frame("List Example");
        Choice c1 = new Choice();
        c1.setBounds(100,100,75,75);

        c1.add("Item 1");
        c1.add("Item 2");
        c1.add("Item 3");

        f1.add(c1);
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);
        
    }


    public static void main(String args[]){
        new awt9();
    }
}