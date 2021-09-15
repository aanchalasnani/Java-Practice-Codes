// use of suspend() and resume() method

class thread1 extends Thread {

    public void run() 
    {
        try
        {System.out.println("First Thread Starts running ");
        sleep(10000); 
        System.out.println("First Thread finishes running ");}
        catch(Exception e){

        }
    }
}

class thread2 extends Thread {

    public void run() 
    {
        try {
        System.out.println("Second Thread Starts running ");
        System.out.println("Second thread is suspennded itself");
        suspend();
       
        System.out.println("Second thread runs again ");
    }
    catch(Exception e ){

    }

    }
}

class Thread5 {

    public static void main(String args[]){
        try {
            thread1 first = new thread1( );

            thread2 second = new thread2();

            first.start();
            second.start();


            System.out.println("revive the second ");
            second.resume();

            System.out.println("Second thread went for 10 second sleep ");
            second.sleep(10000);

            System.out.println(" Wake up Second thread and finishes running ");
            System.out.println(" Demonstration is Finished ");

        }
        catch (Exception e){

        }
    }
}
