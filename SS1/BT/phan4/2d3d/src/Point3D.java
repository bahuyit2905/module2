    public class Point3D extends Point2D {
        float z=0.0f;
        public Point3D(){
        }
        public Point3D(float z){
            this.z=z;
        }
        public Point3D(float z, float x, float y) {
            super(x, y);
            this.z = z;
        }
        public float getZ(){
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public float[] getXYZ(){
            float[] xyz={getX(),getY(),getZ()};
            return xyz;
        }
        public void setXYZ(float x, float y, float z) {
            super.setXY(x,y);
            this.z=z;
        }
    @Override
    public String toString(){
            return "toa do z la : " + getZ() + super.toString();
    }

        public static void main(String[] args) {
            Point3D point3D = new Point3D();
            point3D.setXYZ(6,5,6);
            System.out.println(point3D);
        }
    }
