import java.io.FileInputStream;

public class IO5 {

    public static void main(String args[]) {

        try {
            FileInputStream fin = new FileInputStream("D:/Study/3rd sem material/java lab/testout.txt");
            int i = fin.read();
            System.out.print((char)i); // System.out.print(i); this will print ascii value of 'w' that is 87
            fin.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}

