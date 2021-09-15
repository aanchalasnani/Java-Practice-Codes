class Circle  {

    double x,y,r;
    Circle(double x,double y,double r) {
        this.x=x;
        this.y=y;
        this.r=r;
    }

    Circle(double r){
        x=0;
        y=0;
        this.r=r;
    }
    
    Circle(Circle c){
        x=c.x;
        y=c.y;
        r=c.r;
    }
    Circle(){
        x=0.0;
        y=0.0;
        r=1.0;
    }

    double Area() {
        return((22/7)*r*r);
    }

    double Circumference(){
        return (2*(22/7)*r);
    }
}
class ClassConstructor {
    public static void main(String[] args) {
         
        Circle c1,c2,c3,c4 ;
        c1 = new Circle(3.0,4.0,5.0) ;
        c2 = new Circle(5.0);
        c3 = new Circle(c1);
        c4 = new Circle() ;
        
        System.out.println("Area of circle c1 : "+c1.Area());
        System.out.println("Area of circle c2 : "+c2.Area());
        System.out.println("Area of circle c3 : "+c3.Area());
        System.out.println("Area of circle c4 : "+c4.Area());
    }

}