
import java.util.Scanner;
public class phuongtrinhbac2 {
     double a;
     double b;
     double c;
    double x1, x2;
    double delta;
    public phuongtrinhbac2(){

    }

    public phuongtrinhbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){

        return (delta =b*b-(4*a*c));
    }
    public double getRoot1(){

        return x1=((-b+Math.sqrt(delta))/2*a);
    }
    public double getRoot2(){

        return x2 =((-b-Math.sqrt(delta))/2*a);
    }
    public void tinhNghiem() {
    if(delta > 0) {
        System.out.println("Pt co 2 nghiem"+getRoot1()+" ,"+getRoot2());
    } else if(delta == 0){
        System.out.println("Pt co 1 nghem x1 =x2 : "+getRoot1());
    }else {
        System.out.println("vo nghiem");
    }
    }

}





