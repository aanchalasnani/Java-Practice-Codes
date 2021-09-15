
// write a byte into file
import java.io.*;

class IO3 {
    public static void main(String args[]){

        byte cities[] = {'D','E','L','H','I',' ','M','A','D','R','A','S',' ','L','O','N','D','O','N'};
        FileOutputStream outfile = null;

        try {
            outfile = new FileOutputStream("D:/Study/3rd sem material/java lab/city.txt");
            //connect the outfile to "city.txt"
            outfile.write(cities);
            outfile.close();
        }
        catch(IOException e){
            System.out.println(e);
            System.exit(-1);
        }
    }
}