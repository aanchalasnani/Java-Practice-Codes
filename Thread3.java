//Demonstartion of Thread class Method : getID()
//java Code for Thread Creating by extending the Thread class 

class ThreadId extends Thread  // class ThreadId implements Runnable 
{
        public void run(){

            try { 
                System.out.println("Thread : "+Thread.currentThread().getId()+" is running ");
                
            }
            catch(Exception e ){
                //Throwing an exception 
                System.out.println("Exeption is Caught ");
            }
        }
}

public class Thread3 {

    public static void main(String args[]){

        int n = 0;

        for(int i=0;i<8;i++){
            ThreadId object = new ThreadId() ; // Thread t1 = new Thread(new ThreadId());
            object.start();

        }
    }
}