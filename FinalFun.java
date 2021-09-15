abstract class Base {

    final void fun () {
        System.out.println("Final fun() is calledd");

    }

}
class Derived extends Base {

}

class FinalFun {
    public static void main(String args[]){
        Base b = new Derived();
        b.fun();
    }
}