public class Vector3D {

    private double x;
    private double y;
    private double z;

    public  Vector3D(){}

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Point3D firstPoint, Point3D secondPoint){
        this.x = secondPoint.getX() - firstPoint.getX();
        this.y = secondPoint.getY() - firstPoint.getY();
        this.z = secondPoint.getZ() - firstPoint.getZ();
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }

    public double getZ() {

        return z;
    }

    public void setZ(double z) {

        this.z = z;
    }


    //Длина вектрора
    public double lenghtVector(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3D vector3D)) return false;

        return Double.compare(x, vector3D.x) == 0 && Double.compare(y, vector3D.y) == 0 && Double.compare(z, vector3D.z) == 0;
    }


    public static void main(String[] args){

        Vector3D vector = new Vector3D();

        Vector3D vector1 = new Vector3D(1,2,3);

        Point3D point1 = new Point3D(4,5,6);
        Point3D point2 = new Point3D(2,6,1);

        Vector3D vector2 = new Vector3D(point1,point2);

        System.out.println("Длина первого вектора:" + vector1.lenghtVector());
        System.out.println("Длина второго вектора:"+ vector2.lenghtVector());

        boolean areEqual = vector1.equals(vector2);
        System.out.println("Vector1 равна Vector2? " + areEqual);

    }



}
