class Cube {
    
    //constructor
    int side;
    Cube(int side){
        this.side = side;
    }

    void findArea(){
        int area = side*side;
        System.out.println("Area of Cude : "+area);
    }

    void findVol() {
        int vol = side*side*side;
        System.out.println("Volume of Cude : "+vol);
    }
}

class Cuboid 
{
    int w,h,d,v,s;

    Cuboid(int width,int height,int depth)
    {

        w=width;

        h=height;

        d=depth;

    }

    void findVol() //Method to find volume
    {

        v=w*h*d;

        System.out.println("Volume of cuboid: "+v);

    }


    void findSurf() //Method to find surface area

    {

        s=2*(w*h+h*d+d*w);

        System.out.println("Surface Area of Cuboid : "+s);

    }
}

public class SS {

	public static void main(String[] args) {

        Cube CB = new Cube(5);

        CB.findArea();
        CB.findVol();
		
        Cuboid CBD = new Cuboid(3,4,5);

        CBD.findVol();

        CBD.findSurf();
		
	}
}