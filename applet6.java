import java.awt.*;
import java.applet.*;


public class applet6 extends Applet {

    String fontName;
    int fontSize;
    float leading;
    boolean active;

    //Initializing the string to be displayed

    public void start(){

        String param;
        fontName = getParameter("fontName");
        if(fontName == null){
            fontName = "Not Found";
        }
        param = getParameter("fontSize");
        try {
            if(param != null) // if found
            {
               fontSize = Integer.parseInt(param);
              //fontSize = param.length();
            }
            else {
                fontSize=0;
            }

        }
        catch(NumberFormatException e){
            fontSize=-1;

        }
        param  = getParameter ("leading");
        try {
            if(param != null) // if found
            {
                leading = Float.valueOf(param).floatValue();
            }
            else {
                leading = 0;
            }
        }
        catch(NumberFormatException e) 
        {
            leading = -1;
        }
        param = getParameter("accountEnabled");
        if(param!=null){
            active = Boolean.valueOf(param).booleanValue();
        }
    }
        public void paint(Graphics g){
            g.drawString("Font name : "+fontName,10,10);
            g.drawString("Font Size : "+fontSize ,10,20);
            g.drawString("Leading : "+leading,10,30);
            g.drawString("Acoount active : " + active,10,40);

        }
}
