class Box {
    private double width;
    private double height;
    private double depth;

    Box(double w, double h , double d){
        width = w;
        height = h;
        depth = d;

    }

    double Volume(){

        return (height * width * depth);
    }
}

class BoxWeight extends Box {

    double weigth ;

    BoxWeight(double w, double h, double d, double m)
    {
        super(w,h,d);
        weigth = m;
    }

}

class shipment extends BoxWeight {
    double cost ;

    shipment(double w,double h , double d , double m , double c){
        super(w,h,d,m);
        cost = c;
    }
}

class MultiLevelInheritance {
    public static void main(String args[]){
        shipment s1 = new shipment(10,20,15,10,3.41);
        shipment s2 = new shipment(2,3,4,0.76,1.28);
        double vol;
        vol = s1.Volume();
        System.out.println("VOlume of s1 : "+vol );
        System.out.println("weight os s1 is : "+s1.weigth);
        System.out.println("Shipping cost : "+s1.cost);
        System.out.println();
        vol = s2.Volume();
        System.out.println("Volume of s2 : "+vol);
        System.out.println("weight of s2 : "+s2.weigth);
        System.out.println("Shipping cost s2: "+s2.cost);


    }
}