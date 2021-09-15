//Solution by Aanchal Asnani 
// roll no - 01
//Registration No - PCE19CS001

import java.io.*;
import java.util.*;


class Demo {

    public static void main(String args[])throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name ;
        int age ; 
        double salary;

        System.out.println("Enter your Name : ");
        name = br.readLine();
        System.out.println("Enter your Age : ");
        age = Integer.parseInt(br.readLine());
        System.out.println("Enter your Salalry : ");
        salary =  Double.parseDouble(br.readLine());
        
        System.out.println("Name is ===>"+name);
        System.out.println("Age is ===>"+age);
        System.out.println("Salary is ===>"+salary);


    }
}