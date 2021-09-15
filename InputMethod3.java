
import java.lang.*;
import java.util.*;
import java.io.*;

class Calculator {

    double i;
    double x = Math.sqrt(i);

}

class InputMethod3 {
    public static void main(String args[]){

        Calculator c = new Calculator();
        
        c.i = Integer.parseInt(args[0]);
        c.x = Math.sqrt(c.i);
        System.out.println("The value of i is "+c.i+" sqrt value is : "+c.x);
        
    }
    
}