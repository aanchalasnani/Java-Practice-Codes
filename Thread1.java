
/* Creating three threads using the class threads and then running them concurrently 
classs thread1 extends thread   */


class ThreadA extends Thread {

    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("From thread A with i = "+-1*i);
        }
        System.out.println("Existing from thread : ");
    }
}

class ThreadB extends Thread {

    public void run () {
        for(int j=1;j<=5;j++){
            System.out.println("From thread B with j = "+2*j);
        }
        System.out.println("Existing from Thread B");
    }
}

class ThreadC extends Thread {

    public void run() {

        for(int k =1;k<=5;k++){
            System.out.println("From thread C  with k : "+(2*k-1));

        }
        System.out.println("Exiting from thread C");
    }
}


class Thread1 {
    public static void main ( String args[]) {

        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();

        a.start();
        b.start();
        c.start();

        System.out.println("Multithreading is over ... ");

    }
}