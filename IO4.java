//write a string to a file 
import java.io.*;

class IO4 {

    public static void main(String args[]) {


        try {

            FileOutputStream fout = new FileOutputStream("D:/Study/3rd sem material/java lab/testout.txt");

            String s = "Welcome to NPTEL ";
            byte b[] = s.getBytes();
            //converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("File writing is over");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}