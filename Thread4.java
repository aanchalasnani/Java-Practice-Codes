// use of yield stop and sleep methds

class ClassA extends Thread {

    public void run() {
        System.out.println("Start Thread A .........");

        for(int i=1;i<=5;i++){
            if(i==1) yield();
            System.out.println("from thread A : i = "+i);
        }
        System.out.println("...............Exit Thread A ");
    }
}

class ClassB extends Thread {

    public void run() {
        System.out.println("Start Thread B .........");

        for(int i=1;i<=5;i++){
            
            if(i==2) stop();
            System.out.println("from thread B : j = "+i);
           
        }
        System.out.println("...............Exit Thread B ");
    }
}

class ClassC extends Thread {

    public void run() {
        System.out.println("Start Thread c .........");

        for(int i=1;i<=5;i++){
            if(i==3) {
                try{
                    sleep(1000);
                }
                catch(Exception e) {} 
            }
            System.out.println("from thread c : k = "+i);
        }
        System.out.println("...............Exit Thread c ");
    }
}


class Thread4 {

    public static void main ( String args[]){

        ClassA t1 = new ClassA();
        ClassB t2 = new ClassB();
        ClassC t3 = new ClassC();

        t1.start();
        t2.start();
        t3.start();

        System.out.println("..............ENd of Execution ");


    }
}