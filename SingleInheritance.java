class A {

    int i,j;

    void showij(){
        System.out.println("the values of i and j : "+i+"  "+j);
    }
    void sumA(){
        
        System.out.println("the sum of i and j is : "+(i+j));
}
}

class B extends A {
    int k;

    void showk(){
        
        System.out.println("the value of k : "+k);
    }
    void sumB(){

        System.out.println("The sum of i , j and k is : "+(i+j+k));
    }
}

class SingleInheritance {

    public static void main(String args[]) {

        A objA = new A();
        B objB = new B();

        objA.i=10;
        objA.j=20;

        System.out.println("Contents of objA : ");
        objA.showij();
        System.out.println();

        objB.i = 100;
        objB.j = 200;
        objB.k = 300;
        
        System.out.println("Contents of objB : ");
        objB.showij();
        objB.showk();
        System.out.println();
        objB.sumB();


        
        
    }
}

