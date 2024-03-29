public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(){
    }

    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x=x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y=y;
    }

    public float[] getXY(){
        float[] xy= {getX(), getY()};
        return xy;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "toa do x point2d : " + getX() + " " + "toa do y point2d :" +getY();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(8,9);
        System.out.println(point2D);
       }
    }

