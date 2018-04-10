abstract public class circle extends shape {
    public static int  count;

    static int r ;



    static double area ;

public abstract void circle ();
    public circle(double area1){
        count++;
    }

    public  circle (int r1 , double pi1 ){
        this();
        count++;
        r=r1;


    }
    public void setR (int r1){ r= r1;
    }
    public static int getR() {
        return r;
    }




    public static double getArea() {
        area = (r*r*3.14);
        return area;
    }
}
