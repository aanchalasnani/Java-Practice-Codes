import java.io.*;

class DataInputStream {
    public static void main(System args[]){ //throws exception
        Float principal = new Float(0);
        Float rateofInterest = new Float(0);

        int numberofYears = 0;

        try {
            DataInputStream in = new DataInputStream(System.in);

            String tempString;
            System.out.print("Enter Principal Amount : ");
            System.out.flush();
            tempString = in.readLine();
            principal = Float.valueOf(tempString);
            
            System.out.print("Enter Rate of Interest : ");
            System.out.flush();
            tempString = in.readLine();
            rateofInterest = Float.valueOf(tempString);

            System.out.print("Enter number of Years : ");
            System.out.flush();
            tempString = in.readLine();
            numberofYears = Interger.parseInt(tempString);

            float totalinterest = principal*rateofInterest*numberofYears;

            System.out.println("Total Interest : " + totalinterest);
        }
        catch (Exception ex) {}   
        

    }
}