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

class CircleClass {
    public static void main(String[] args) {
         
        Circle c,d ;
        c = new Circle(); //initialisation
        d = new Circle();
        c.r=5.00 ; c.x=0.00 ; c.y=0.00;
        d.r = 10.00 ; d.x = 10.00; d.y=20.00;
        System.out.println("Area of circle c : "+c.Area());
        System.out.println("Area of circle d : "+d.Area());

     }
        
    
   
    
}