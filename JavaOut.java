/* 

Program Code by - AANCHAL ASNANI , PCE19CS001

Q1. Wrtie a program in java to store name, age, salary,
 marital status of 5 employees in a file in Java Native data formats.
 Ask the values of employees from user. 
*/

import java.io.*;


class JavaOut {

    public static void main(String args[]) throws Exception{
        FileOutputStream f= new FileOutputStream("EmployeesData.dat");
        DataOutputStream dos = new DataOutputStream(f);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i< 5 ; i++) //for 5 employees
        {
            String name;
            int age;
            double salary;
            boolean isMarried;

           
            System.out.println("Enter the name of "+( i + 1 )+ " Employee : ");
            name = br.readLine();

            System.out.println("Enter the age of "+ ( i + 1 ) + " Employee : ");
            age = Integer.parseInt(br.readLine());

            System.out.println("Enter the salary of "+ ( i + 1 ) + " Employee : ");
            salary = Double.parseDouble(br.readLine());

            System.out.println("Enter the marital status of "+ ( i + 1 ) + " Employee : ");
            isMarried = Boolean.parseBoolean(br.readLine());


            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(salary);
            dos.writeBoolean(isMarried);
        }
        dos.flush();
        dos.close();
    }
}