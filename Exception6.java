// nested try catch block eg.
class Exception6 { 
    public static void main(String args[]){

        try {
            // to catch divide by zero 
            int a = args.length;
            int b = 42/a;
            // divide by zero exception 

            System.out.println("a = "+a);
            if(a==1){
                a =a/(a-a); // another divide by zero exception 
            }

                try {
                    // nested try block 

                    if(a==2){
                        // if two command line are used , then out of bounds error occurs

                        int c[] = { 1 };
                        c[2] = 99;

                    }

                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(" Array index out of bound : "+e);
                }
            
        }
        catch(ArithmeticException e){
            System.out.println("Divide by 0 : "+e);
        }
    }
}