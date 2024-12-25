public class Vector3DProcessor {

    //Сумма векторов
    public static Vector3D additionVector(Vector3D firstVector, Vector3D secondVector){
        Vector3D sum = new Vector3D();

        sum.setX(firstVector.getX() + secondVector.getX());
        sum.setY(firstVector.getY() + secondVector.getY());
        sum.setZ(firstVector.getZ() + secondVector.getZ());

        return sum;
    }

    //Разность векторов
    public static Vector3D subtractionVector(Vector3D firstVector, Vector3D secondVector){
        Vector3D difference  = new Vector3D();

        difference.setX(firstVector.getX() - secondVector.getX());
        difference.setY(firstVector.getY() - secondVector.getY());
        difference.setZ(firstVector.getZ() - secondVector.getZ());

        return difference ;
    }

    //Скалярное произведение
    public static double scalMultVector(Vector3D firstVector, Vector3D secondVector){
        return firstVector.getX() * secondVector.getX() + firstVector.getY() * secondVector.getY() + firstVector.getZ() * secondVector.getZ();
    }

    //Векторное произведение
    public static Vector3D vectMultVetor(Vector3D firstVector, Vector3D secondVector){
        Vector3D product = new Vector3D();

        product.setX(firstVector.getY() * secondVector.getZ() - firstVector.getZ() * secondVector.getY());
        product.setY(firstVector.getZ() * secondVector.getX() - firstVector.getX() * secondVector.getZ());
        product.setZ(firstVector.getX() * secondVector.getY() - firstVector.getY() * secondVector.getX());

        return product;
    }

    //Проверка на коллениарность
    public static boolean collinearityVector(Vector3D firstVector, Vector3D secondVector){
        double x = firstVector.getX() / secondVector.getX();
        double y = firstVector.getY() / secondVector.getY();
        double z = firstVector.getZ() / secondVector.getZ();
        if(x == y & y == z & x == z){
            return true;
        } return false;

    }

    public static void main(String[] args){
        Vector3D vector1 = new Vector3D(1,2,3);
        Vector3D vector2 = new Vector3D(2,6,3);

        Vector3D vectorsum = additionVector(vector1,vector2);
        System.out.println("Сумма двух векторов: (" + vectorsum.getX() + "," + vectorsum.getY() + "," + vectorsum.getZ() + ")" );

        Vector3D vectorsub = subtractionVector(vector1,vector2);
        System.out.println("Разность двух векторов: (" + vectorsub.getX() + "," + vectorsub.getY() + "," + vectorsub.getZ() + ")");
        System.out.println(vectorsub);

        System.out.println("Скалярное произведение векторов:" + scalMultVector(vector1,vector2));

        Vector3D vectormult = vectMultVetor(vector1,vector2);
        System.out.println("Векторное произведение: (" + vectormult.getX() + "," + vectormult.getY() + "," + vectormult.getZ() + ")");

        if(collinearityVector(vector1,vector2)){
            System.out.println("Векторы коллиниарны.");
        } else System.out.println("Векторы не коллиниарны.");
    }
}
