import java.io.FileOutputStream;

public class IO2 
{
    public static void main(String args[]){
        try{
            FileOutputStream fout = new FileOutputStream("D:/Study/3rd sem material/java lab/test.txt");
            fout.write(65);
            fout.close();
            System.out.println("File Writing is over .......... ");
        }
        catch(Exception e){ 
            System.out.println(e);
        }
    }
}