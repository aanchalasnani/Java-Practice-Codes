
//coping a file into another using byteStream class 


import java.io.*;

class IO9 {

    public static void main(String args[])
    {
        FileInputStream infile = null;
        FileOutputStream outfile = null;

        byte byteRead; // declare a variable to hold a byte

        try {
            //connect infile to in.dat

            infile = new FileInputStream ("D:/Study/3rd sem material/java lab/input.dat");


            //connect outfile to out.dat

            outfile = new FileOutputStream("D:/Study/3rd sem material/java lab/out.dat");


            byteRead = (byte)infile.read();

            while(byteRead != -1)
            {
                outfile.write(byteRead);
                byteRead = (byte)infile.read();

            }
        }
        catch(FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}