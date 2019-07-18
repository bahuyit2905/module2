public class  MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){
    }

    public MoveablePoint( float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] speed= {getXSpeed(),getYSpeed()};
        return speed;
    }


    public void setSpeed(float x, float y, float xSpeed, float ySpeed){
        super.setXY( x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString(){
        return "Co toa do xSpeed la: " + getXSpeed() + " " + "Co toa do ySpeed la: " + getYSpeed();
    }

    public MoveablePoint move() {
         x += xSpeed;
         y += ySpeed;
         return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.getSpeed();
        System.out.println(moveablePoint);
        moveablePoint=new MoveablePoint(2,3);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
