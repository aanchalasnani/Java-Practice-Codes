// use of priority threading 

class ClassAA extends Thread {

    public void run() {
        System.out.println("Start Thread A .........");

        for(int i=1;i<=5;i++){
            System.out.println("from thread A : i = "+i);
        }
        System.out.println("...............Exit Thread A ");
    }
}

class ClassBB extends Thread {

    public void run() {
        System.out.println("Start Thread B .........");

        for(int i=1;i<=5;i++){
            System.out.println("from thread B : j = "+i);
           
        }
        System.out.println("...............Exit Thread B ");
    }
}

class ClassCC extends Thread {

    public void run() {
        System.out.println("Start Thread c .........");

        for(int i=1;i<=5;i++){
            System.out.println("from thread c : k = "+i);
        }
        System.out.println("...............Exit Thread c ");
    }
}


class Thread6 {

    public static void main ( String args[]){

        ClassAA t1 = new ClassAA();
        ClassBB t2 = new ClassBB();
        ClassCC t3 = new ClassCC();

        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(t2.getPriority()+1);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("..............ENd of Execution ");


    }
}