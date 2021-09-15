import java.io.FileInputStream;

public class IO6 {

    public static void main(String args[]) {

        try {
            FileInputStream fin = new FileInputStream("D:/Study/3rd sem material/java lab/testout.txt");
            int i = 0;
            while((i=fin.read())!=-1)
            {
                System.out.print((char)i); // System.out.print(i); this will print ascii value of 'w' that is 87
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}

