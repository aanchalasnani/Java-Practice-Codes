class Circle  {

    double x,y,r;
    Circle(double a,double b,double c) {
        x=a;
        y=b;
        r=c;

    }
    double Area() {
        return((22/7)*r*r);
    }
    double Circumference()
    {
        return (2*(22/7)*r);
    }
}

class Box {
    double breath,height,length;
    Box(double b , double h , double l){
        breath = b;
        height = h;
        length = l;
    }
    double Area(){
        return(2*((breath*length)+(length*height)+(height*breath)));
    }
    double Volume(){
        return(height*breath*length);
    }
}

class Constructor {
    public static void main(String[] args) {
         
        Circle c = new Circle(0.0,0.0,5.0);
       // c.r=5.00 ; c.x=0.00 ; c.y=0.00;
        System.out.println("Area of circle : "+c.Area());
        System.out.println("Circumference : "+c.Circumference());

        Box b = new Box(3.0,4.0,5.0);
       // b.breath = 3.0 ; b.height = 4.0 ; b.length = 5.0;
        System.out.println("Area of Box : "+b.Area());
        System.out.println("Volume of Box : "+b.Volume());


     }  
}