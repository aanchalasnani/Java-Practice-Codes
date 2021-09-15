// Data Race example 

public class Thread7 extends Thread {

    public static int x;

    public void run(){
        for(int i=0 ; i<100 ; i++){
            x = x+1;
            x = x-1;
        }
    }

    public static void main(String args[]) {

        x = 0 ;
        for(int i=0;i<1000;i++){
            new Thread7().start();
            System.out.println(x); // x not always zero 
        }
    }
}