import java.lang.*;

class Exception5 {

    public static void main(String args[]) throws Exception {

        int [] array  = new int[3];

        try {
            for(int i=0;i<4;i++){
                array[i]=i;
            }
            System.out.println(array);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" fillin : "+e.fillInStackTrace());
            System.out.println("cause : "+e.getCause());
            System.out.println("local : "+e.getLocalizedMessage());
            System.out.println("message : "+e.getMessage());
            System.out.println("trace : "+e.getStackTrace());
            System.out.println();
            System.out.println();
            System.out.println("Trace : "); e.printStackTrace();
            System.out.println();
            System.out.println("String : "); e.toString();
            System.out.println();
            System.out.println();

            System.out.println("oops , we went too far , better go back to 0 !");
            throw (Exception) new Exception().initCause(e);

        }
        finally{
            System.out.println(array);
        }
    }

}