//example of bufferedoutputstream for writing into a file 
import java.io.*;

class IO10 
{
public static void main(String args[]) throws Exception {

    FileOutputStream fout = new FileOutputStream("D:/Study/3rd sem material/java lab/testout1.txt");

    BufferedOutputStream bout = new BufferedOutputStream(fout);

    String s="WELCOME TO JAVA!!";
    byte b[] = s.getBytes();
    bout.write(b);
    bout.flush();
    bout.close();
    fout.close();
    System.out.println("SUCCESS............");

}
}