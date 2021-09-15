abstract class Base {

    final void fun () {
        System.out.println("Final fun() is called");

    }

}
class Derived extends Base {
        //eroor aayegi agar fun define krdiya to
}

class FinalClass {
    public static void main(String args[]){
        Base b = new Derived(); // base can't be instantiated since it is an abstract class 
        b.fun();
    }
}