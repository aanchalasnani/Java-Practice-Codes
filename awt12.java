import java.io.*;
import java.awt.*;

class awt12 extends Frame {

    //definind window components 
    TextField number,name,marks;

    Button enter,done;

    Label numLabel , nameLabel , markLabel ;
    DataOutputStream dos;

    //initialize the frame

    public awt12 (){
        super("Create Student File");

    }

    public void setup() {

        resize(400,400);
        setLayout(new Grid(4,2));

        //Create the components of the Frame

        number = new TextField(25);
        numLabel = new Label("Roll NUmber ");
        name = new TextField(25);
        nameLabel= new Label("Student Label ");
        marks = new Label("Marks");

    }
}