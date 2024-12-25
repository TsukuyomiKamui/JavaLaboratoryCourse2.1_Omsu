public class Vector3DArray {

    private Vector3D[] vectors;


    public Vector3DArray(int size) {
        this.vectors = new Vector3D[size];

        for (int i = 0; i < size; i++) {
            this.vectors[i] = new Vector3D();
        }
    }
    //Длина массива
    public int lengthVA() {

        return vectors.length;
    }


    //замена элемента с индексом
    public void replace(int index, Vector3D vector ){

        vectors[index] = vector;
    }

    //Поиск максимальной длины вектора в массиве
    public  double maxLenghtVector(){

        double maxLenght = 0;

        for(int i = 0; i < vectors.length; i++){
            if(vectors[i].lenghtVector()> maxLenght){
                maxLenght = vectors[i].lenghtVector();
            }
        }
        return maxLenght;

    }

    //Поиск элемента
    public int elementSearch(Vector3D vector){
        for(int i = 0; i < vectors.length; i++){
            if(vector.equals(vectors[i])){
                return i;
            }
        }
        return -1;
    }

    //Сумма всех векторов
    public Vector3D additionalAllVector(){
        double sumX = 0;
        double sumY = 0;
        double sumZ = 0;

        for(int i = 0; i < vectors.length; i++){
            sumX += vectors[i].getX();
            sumY += vectors[i].getY();
            sumZ += vectors[i].getZ();
        }
        return new Vector3D(sumX,sumY,sumZ);
    }

    //Линейная комбинация
    public Vector3D linearCombination(double[] coefficients) {
        if (coefficients.length != vectors.length) {
            throw new IllegalArgumentException("Размеры массивов не совпадают");
        }

        double sumX = 0;
        double sumY = 0;
        double sumZ = 0;

        for (int i = 0; i < coefficients.length; i++) {
            sumX += coefficients[i] * vectors[i].getX();
            sumY += coefficients[i] * vectors[i].getY();
            sumZ += coefficients[i] * vectors[i].getZ();
        }

        return new Vector3D(sumX, sumY, sumZ);
    }


    //Сдвиг точки на вектор
    public Point3D[] shiftPoints(Point3D point) {
        Point3D[] shiftPoints = new Point3D[vectors.length];

        for (int i = 0; i < vectors.length; i++) {

            double shiftX = point.getX() + vectors[i].getX();
            double shiftY = point.getY() + vectors[i].getY();
            double shiftZ = point.getZ() + vectors[i].getZ();

            shiftPoints[i] = new Point3D(shiftX, shiftY, shiftZ);
        }
        return shiftPoints;
    }

    public static void main(String[] args) {

        Vector3DArray vectorArray = new Vector3DArray(3);

        System.out.println("Длина массива векторов:" + vectorArray.lengthVA());

        vectorArray.replace(0, new Vector3D(6,7,8));
        vectorArray.replace(1, new Vector3D(3,8,4));
        vectorArray.replace(2, new Vector3D(4,5,6));

        System.out.println(vectorArray.maxLenghtVector());

        Vector3D vect = new Vector3D(1,2,3);
        System.out.println(vectorArray.elementSearch(vect));

        Vector3D sumAll = vectorArray.additionalAllVector();
        System.out.println("Сумма всех векторов: (" + sumAll.getX() + "," + sumAll.getY() + "," + sumAll.getZ());

        Point3D point = new Point3D(1, 1, 1);
        Point3D[] shiftedPoints = vectorArray.shiftPoints(point);
        for (Point3D shiftedPoint : shiftedPoints) {
            System.out.println("Сдвинутая точка: (" + shiftedPoint.getX() + ", " + shiftedPoint.getY() + ", " + shiftedPoint.getZ() + ")");
        }

        double[] coefficients = {1, 0.5, 2};
        try {
            Vector3D linearCombination = vectorArray.linearCombination(coefficients);
            System.out.println("Линейная комбинация: (" + linearCombination.getX() + ", " + linearCombination.getY() + ", " + linearCombination.getZ() + ")");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
