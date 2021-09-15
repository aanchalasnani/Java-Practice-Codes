class Circle  {

    double x,y,r;

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

    double Area(){
        return(2*((breath*length)+(length*height)+(height*breath)));
    }
    double Volume(){
        return(height*breath*length);
    }
}

class MultiClass {
    public static void main(String[] args) {
         
        Circle c = new Circle();
        c.r=5.00 ; c.x=0.00 ; c.y=0.00;
        System.out.println("Area of circle : "+c.Area());
        System.out.println("Circumference : "+c.Circumference());

        Box b = new Box();
        b.breath = 3.0 ; b.height = 4.0 ; b.length = 5.0;
        System.out.println("Area of Box : "+b.Area());
        System.out.println("Volume of Box : "+b.Volume());


     }  
}