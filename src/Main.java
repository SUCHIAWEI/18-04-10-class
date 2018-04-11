import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        circle c = new circle(5);
        System.out.print("-----圓形-----"+"\n"+"半徑:"+c.getR()+"\n"+"圓周率:3.14"+"\n");
        c.show();
        System.out.println("-------------");

        rectangle rect = new rectangle(12,13);
        System.out.println("----長方形----"+"\n"+"寬:"+rect.getWidth()+"\n"+"高:"+rect.getHeight());
        rect.show();
        System.out.println("-------------");

        triangle tri = new triangle(5,12,90);
        System.out.println("----三角形----"+"\n"+"a:"+tri.getA()+"\n"+"b:"+tri.getB()+"\n"+"ab夾角:"+tri.getAngle()+"度");
        tri.show();
        System.out.println("-------------");




            }
        }


