class A {

    int i;

}

class B extends A {

    int i;

    B(int a , int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("the value of Super class i is "+super.i);
        System.out.println("the value of Sub CLass i is "+i);
    }
}

class Inheritance3 {

    public static void main (String args[]){
        B objB = new B(1,2);
        objB.show();
    }
}