import javax.swing.*;

class Swing10 {

    JMenu menu , submenu ;

    JMenuItem i1,i2,i3,i4,i5;
    Swing10() {

        JFrame f = new JFrame("Menu and MenuItem Example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub MEnu ");
        i1 = new JMenuItem("Item 1 "); i2 = new JMenuItem("Item 2 ");
        i3 = new JMenuItem("Item3 ");
        i4 = new JMenuItem("ITem4 ");
        //i5 = new JMenuItem("Item5 ");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

    }

    public static void main(String args[]){
        new Swing10();
    }
}