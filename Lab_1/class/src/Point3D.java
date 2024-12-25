public class Point3D {

    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {

        this.x = x;
    }

    public double getY(){

        return y;
    }

    public void setY(double y){

        this.y = y;
    }

    public double getZ(){
        return z;
    }

    public void setZ(double z){
        this.z = z;
    }

    public void print() {
        System.out.printf("Point(%f, %f, %f)%n", x, y, z);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D point3D)) return false;

        return Double.compare(x, point3D.x) == 0 && Double.compare(y, point3D.y) == 0 && Double.compare(z, point3D.z) == 0;
    }

    public static void main(String[] args) {

        Point3D point1 = new Point3D();
        Point3D point31 = new Point3D();
        point1.print();


        Point3D point2 = new Point3D(1.0, 2.0, 3.0);
        point2.print();


        boolean areEqual = point1.equals(point2);
        System.out.println("Point1 равна Point2? " + areEqual);


        boolean isSelfEqual = point1.equals(point31);
        System.out.println(point1 == point31);
        System.out.println("Point1 равна самой себе? " + isSelfEqual);
    }
}
