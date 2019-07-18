public class Point {
    protected float x;
    protected float y;

    public Point(){
    }
    public Point(float x, float y) {
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] xy={getX(),getY()};
        return xy;
    }
    public void setXY(float x , float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return "Toa do x la : " + getX() + " " + "Toa do y la" + getY();
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(2,3);
        System.out.println(point);
    }
}
