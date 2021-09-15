

//          CHECK BOX GROUP EXAMPLE

import java.awt.*;

class awt4 {

    awt4() //default constructor
    {
        Frame f = new Frame("CheckboxGroup  Example");
        CheckboxGroup cgb = new CheckboxGroup();

        Checkbox c1 = new Checkbox("C++",cgb,false); 
        c1.setBounds(100,100,50,50);
        Checkbox c2 = new Checkbox("JAVA",cgb,true);
        c2.setBounds(100,150,50,50);


        
        
        Checkbox c3 = new Checkbox("NPTEL",false);
        c3.setBounds(100,200,50,50);
        
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]){
         new awt4();
    }
}