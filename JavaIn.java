/* 

Program Code by - AANCHAL ASNANI , PCE19CS001

Q2. Wrtie a program is java to read the file written in question
 one and display the contents on VDU in tabular manner.
*/

import java.io.*;


class JavaIn {

    public static void main(String args[]) throws Exception{
        FileInputStream f= new FileInputStream("EmployeesData.dat");
        DataInputStream dis = new DataInputStream(f);
      

        System.out.println("   NAME    ||    AGE    ||  SALARY  ||   MARITAL STATUS");
        for(int i = 0 ; i< 5 ; i++) //for 5 employees
        {
            System.out.println(dis.readUTF() +"   ||   "+ dis.readInt() +"  ||  "+dis.readDouble()+"  ||   "+dis.readBoolean());
        }
        
        dis.close();
    }
}