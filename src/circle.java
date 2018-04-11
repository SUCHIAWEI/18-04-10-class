 public  class circle extends shape {
    public static int count;
    private int r ;
    public circle (){
        count++;
}
    public  circle (int r1 ){
        this();
        setR(r1);
    }
     public void setR (int r1){ r= r1;
     }
     public int getR(){return r;}
    public void show(){
        System.out.println("面積="+(r*r*3.14));
        System.out.println("周長="+(r*2*3.14));
    }
}
