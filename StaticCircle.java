class Circle {

    static int count=0;
    double x,y,r;

    public Circle(double x,double y , double r){
        this.x = x ; this.y=y; this.r=r;
        count++;
    }
    public Circle (double r){
        //this(0.0,0.0,r);
        x=0.0;
        y=0.0;
        this.r=r;
        count++;
    }
    public Circle(){
        //this(0.0,0.0,0.1);
        x=0.0;
        y=0.0;
        r=0.1;
        count++;
    }
    public Circle(Circle c){
        //this(c.x,c.y,c.r);
        x=c.x;
        y=c.y;
        r=c.r;
        count++;
    }
    public double Circumference(){
        return(2*3.14*r);
    }
    public double Area(){
        return(3.14*r*r);
    }
    // Instance Method : 
    public Circle Bigger(Circle c)
    {
        if(c.r>r){
            return c;
        }
        else return this;
    }
    // class Method : 
    public static Circle Bigger(Circle a, Circle b){
        if(a.r>b.r){
            return a;
        }
        else {
            return b;
            
        }
    }
}
class StaticCircle {
    public static void main(String args[]){

        Circle c1 = new Circle();
        System.out.println("The value of count c1 : "+c1.count);

        Circle c2 = new Circle(5.0);
        System.out.println("The value of count c2 : "+c2.count);

        Circle c3 = new Circle(c1);
        System.out.println("The value of count c3 : "+c3.count);

        Circle c4 = new Circle();
        System.out.println("The value of count c4 : "+c4.count);

        System.out.println("\n\n\nc1 : "+c1.count+" c2: "+c2.count+" c3 : "+c3.count + " c4 : "+c4.count);

        Circle a = new Circle(2.0);

        Circle b = new Circle(3.0);

        Circle c = a.Bigger(b);
        System.out.println(" the bigger radius is "+ c.r);
        Circle d = Circle.Bigger(a,b); 
        System.out.println(" the bigger radius is "+ d.r);

    }

}