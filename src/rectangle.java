public class rectangle {
    public static int count;
    private int width ;
    private int height ;
    public rectangle(){
        count++; }
    public rectangle (int width1 , int height1){
        this();
        setWidth(width1);
        setHeight(height1); }
    public void setWidth (int width1){ width= width1; }
    public int getWidth(){return width;}
    public void setHeight (int height1){ height= height1; }
    public int getHeight(){return height;}
    public void show() {
        System.out.println("面積=" + (width * height ));
        System.out.println("周長=" + (width+height)*2 );
    }

}
