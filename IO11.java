//example of java BufferedInputStream for reading from a file 

import java.io.*;

class IO11 {
    public static void main(String args[]){
        try {
            FileInputStream fin = new FileInputStream("D:/Study/3rd sem material/java lab/out.dat");
            BufferedInputStream bin = new BufferedInputStream(fin);

            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}