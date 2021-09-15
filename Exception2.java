//try block with multiple catch 


public class Exception2 {

    public static void main(String args[]) {

        try {
            int i = args.length; // no of argumemts in thr command line
            String myString[] = new String[i];
            // if i=0 then mystring null pointer error

            if(args[0].equals("Java")) //#1
            {
                System.out.println("first word is Java ! ");
            }
            System.out.println(" NUmber of arguments : "+ i);
            int x = 12/i; // #2
            int y[] = {555,999}; //  y is an array of size 2 with indez 0,1
            y[i] = x;  //#3 // index out of bound will ocuur is i>1

        }
        catch (ArithmeticException e){
            System.out.println(" Division by 0 "+e);
        }
        catch(NullPointerException e){
            System.out.println("A NULL pointer exception : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob : "+e);
        }
    }
}