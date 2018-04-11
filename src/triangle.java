public class triangle extends shape {
    public static int count;
    private int a ;
    private int b ;
    private float angle;
    public triangle(){
        count++; }
    public triangle(int a1,int b1 , float angle1){
        this();
        setA(a1);setB(b1);setAngle(angle1); }
    public void setA (int a1){ a= a1; }
    public int getA(){return a;}
    public void setB (int b1){ b = b1; }
    public int getB(){return b;}
    public void setAngle (float angle1){ angle= angle1; }
    public float getAngle(){return angle;}
    public void show(){
        System.out.println("面積=" + (a*b)/2 );
        System.out.println("周長=" + (Math.sqrt(a*a+b*b)+a+b) );
    }
}
