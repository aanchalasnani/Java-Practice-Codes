
import java.io.*;

class IO13 {

    public static void main(String args[]) throws IOException{

        //declare file streams
        FileInputStream file1 = null;
        FileInputStream file2 = null;

        //declare file3 to store combined files
        SequenceInputStream file3 = null;
        
        //open the files to be concantenated
        file1 = new FileInputStream("D:/Study/3rd sem material/java lab/input1.txt");
        file2 = new FileInputStream("D:/Study/3rd sem material/java lab/input2.txt");

        file3 = new SequenceInputStream(file1,file2);

        //create buffered input and output streams 
        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);

        //read and wrute till the end of buffers 
        int ch;

        while((ch=inBuffer.read())!=-1){
            outBuffer.write((char)ch);

        }
        inBuffer.close();
        outBuffer.close();
        file1.close();
        file2.close();


    }
}