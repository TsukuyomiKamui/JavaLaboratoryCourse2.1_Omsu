import java.util.Objects;

public class ProductPackaging {
    private  String namePacking;
    private  double weightPacking;

    public ProductPackaging(String namePacking,double weightPacking){
        this.namePacking = namePacking;
        this.weightPacking = weightPacking;
    }

    public ProductPackaging(){}

    public String getNamePacking() {
        return namePacking;
    }

    public double getWeightPacking() {
        return weightPacking;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPackaging)) return false;

        ProductPackaging that = (ProductPackaging) o;
        return Double.compare(weightPacking, that.weightPacking) == 0 && Objects.equals(namePacking, that.namePacking);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(namePacking);
        result = 31 * result + Double.hashCode(weightPacking);
        return result;
    }

    @Override
    public String toString() {
        return "Упаковка{" +
                " Название: " + namePacking  +
                ", Вес: " + weightPacking +
                '}';
    }
}