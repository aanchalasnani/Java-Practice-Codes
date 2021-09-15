class Box {

    double width,height,depth;

    Box(){
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    double Volume(){
        return(width*height*depth);
    }
}

class BoxWeight extends Box {

    double weight;

    BoxWeight(){
        super();
        weight = 0.0;
    }
    BoxWeight(double w,double h, double d, double m){
        super(w,h,d);
        weight = m;
    }

}

class Inheritance2 {

    public static void main(String args[]){
        Box b1 = new Box (10,20,15);
        BoxWeight b2 = new BoxWeight(2.0,3.0,4.0,0.076);
        double vol;
        vol = b1.Volume();
        System.out.println("The Volume of box B1 is : " + vol);

        vol = b2.Volume();
        System.out.println("The Volume of box B2 is : " + vol);
        System.out.println("The Weigth of box B2 is : " + b2.weight);

    }
}