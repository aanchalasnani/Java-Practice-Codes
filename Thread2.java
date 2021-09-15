
/* Creating three threads using the runnable interface 
and then running them concurrently */

class ThreadX implements Runnable {

    public void run () {

        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread X with i = "+-1*i);
        }
        System.out.println("Existing Thread X ..... ");
    }
}

class ThreadY implements Runnable {

    public void run () {

        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread Y with j = "+2*i);
        }
        System.out.println("Existing Thread y ..... ");
    }

}

class ThreadZ implements Runnable {

    public void run () {

        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread Z with k = "+(2*i-1));
        }
        System.out.println("Existing Thread Z ..... ");
    }

}


public class Thread2 {
    public static void main(String args[]){
        ThreadX x= new ThreadX();
        Thread t1 = new Thread(x);

        ThreadY y = new ThreadY();
        Thread t2 = new Thread(y);

        Thread t3 = new Thread(new ThreadZ());

        t1.start();
        t2.start();
        t3.start();

        System.out.println(".............MultiThreading is over ");

    }
}