import java.io.*;

class IO1{
    public static void main(String args[])  throws IOException
    {

        
        InputStream input = new FileInputStream("D:/Study/College/java lab/emp.dat");  
        DataInputStream inst = new DataInputStream(input);  
        int count = input.available();  
        byte[] ary = new byte[count];  
        inst.read(ary);  
        for (byte bt : ary) {  
        char k = (char) bt;  
        System.out.print(k+" ");  
        }

    }
}