//coping a file into another
import java.io.*;

class IO8 {

    public static void main(String args[]){
        //declare and create input output files

        File inFile = new File("D:/Study/3rd sem material/java lab/input.dat");
        File outFile = new File("D:/Study/3rd sem material/java lab/output.dat");

        FileReader ins = null;
        FileWriter outs = null;

        try {
            ins = new FileReader(inFile);
            outs = new FileWriter(outFile);

            int ch;
            while((ch = ins.read())!=-1){
                outs.write(ch);

            }

        }
        catch(IOException e){
            System.out.println(e);
            System.exit(-1);
        }
        finally {
            try {
                ins.close();
                outs.close();
            }
            catch(IOException e){

            }
        }
    }
}