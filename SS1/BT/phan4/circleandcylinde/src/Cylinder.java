public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(){
        this.height=height;
    }

    public double getvolume(){
        return  Math.PI * getRadius() * getRadius() * this.height;
    }

    @Override
    public String toString(){
        return "chieu cao la: " + getHeight() + super.toString()+ " " + "the tich la: " + getvolume();
    }
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, 4, "red");
        System.out.println(cylinder);
    }
}
