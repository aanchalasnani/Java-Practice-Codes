import java.io.*;

class IO14 {
    public static void main(String args[]){

        RandomAccessFile file = null;

        try {
            file = new RandomAccessFile("rand.dat","rw");

            //writing to the file 
            file.writeChar('X');
            file.writeInt(555);
            file.writeDouble(3.141);

            file.seek(0); // go to the beginning

            System.out.println(file.readChar());
            System.out.println(file.readInt()); //seek(2) position 
            System.out.println(file.readDouble());


            file.seek(2); // go to the second item

            System.out.println(file.readInt());
            System.out.println("this is : "+file.length());
            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(4);
            System.out.println(file.readBoolean());
            file.close();


        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}