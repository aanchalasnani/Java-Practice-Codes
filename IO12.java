//java SequenceInputStream example : Reading sequence of files

import java.io.*;

class IO12 {

    public static void main(String args[]) throws Exception {

        FileInputStream input1 = new FileInputStream("D:/Study/3rd sem material/java lab/input1.txt");
        FileInputStream input2 = new FileInputStream("D:/Study/3rd sem material/java lab/input2.txt");

        SequenceInputStream inst = new SequenceInputStream(input1,input2);

        int j;

        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }

        inst.close();
        input1.close();
        input2.close();

    }
}