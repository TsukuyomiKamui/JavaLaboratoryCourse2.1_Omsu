import java.util.Objects;
import java.util.Arrays;

//Товар
class Product {
    private String nameProduct;
    private String descriptionProduct;

    public Product(String nameProduct, String descriptionProduct) {
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
    }
    public Product(){}

    public String getNameProduct() {
        return nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

     public void setNameProduct(String nameProduct) {
         this.nameProduct = nameProduct;
     }

     public void setDescriptionProduct(String descriptionProduct) {
         this.descriptionProduct = descriptionProduct;
     }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;
        return nameProduct.equals(product.nameProduct) && descriptionProduct.equals(product.descriptionProduct);
    }

    @Override
    public int hashCode() {
        int result = nameProduct.hashCode();
        result = 31 * result + descriptionProduct.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Товар{" +
                " Название товара: " + nameProduct +
                ", Описание товара: " + descriptionProduct +
                '}';
    }
}


//Весовой товар
class WeightProduct extends Product{

    public  WeightProduct(String nameWeightProduct, String descriptionWeightProduct){
        super(nameWeightProduct,descriptionWeightProduct);
    }

    public  WeightProduct(){}

    public String getNameWeightProducts() {
        return getNameProduct();
    }

    public void setNameWeightProducts(String nameWeightProducts) {
        setNameProduct(nameWeightProducts);
    }

    public String getDescriptionWeightProducts() {
        return getDescriptionProduct();
    }

    public void setDescriptionWeightProducts(String descriptionWeightProducts) {
        setDescriptionProduct(descriptionWeightProducts);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        WeightProduct that = (WeightProduct) o;
        return Objects.equals(getNameWeightProducts(), that.getNameWeightProducts())
                && Objects.equals(getDescriptionWeightProducts(), that.getDescriptionWeightProducts());
    }

    @Override
    public int hashCode() {
        int result = getNameWeightProducts().hashCode();
        result = 31 * result + getDescriptionWeightProducts().hashCode();
        return result;}

    @Override
    public String toString() {
        return "Весовой товар: {" +
                " Название товара: " + getNameWeightProducts() +
                ", Описание: " + getDescriptionWeightProducts() +
                '}';
    }

}


//Штучный товар
class  PieceProduct extends Product{

    private  double weightPieceProduct;

    public PieceProduct(String namePieceProduct, String descriptionPieceProduct, double weightPieceProduct){
        super(namePieceProduct,descriptionPieceProduct);
        this.weightPieceProduct = weightPieceProduct;
    }
    public PieceProduct(){}

    public String getNamePieceProduct(){
        return getNameProduct();
    }
    public void setNamePieceProduct(String namePieceProduct) {
        setNameProduct(namePieceProduct);
    }

    public String getDescriptionPieceProduct() {
        return getDescriptionProduct();
    }

    public void setDescriptionPieceProduct(String descriptionPieceProduct) {
        setDescriptionProduct(descriptionPieceProduct);
    }

    public double getWeightPieceProduct() {
        return weightPieceProduct;
    }

    public void setWeightPieceProduct(double weightPieceProduct) {
        this.weightPieceProduct = weightPieceProduct;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PieceProduct)) return false;
        if (!super.equals(o)) return false;

        PieceProduct that = (PieceProduct) o;
        return Objects.equals(getNamePieceProduct(), that.getNamePieceProduct())
                && Objects.equals(getDescriptionPieceProduct(), that.getDescriptionPieceProduct())
                && weightPieceProduct == that.weightPieceProduct;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(weightPieceProduct);
        return result;
    }

    @Override
    public String toString() {
        return " Штучный товар: {" +
                " Имя товара: " + getNamePieceProduct()  +
                ", Описание: " + getDescriptionPieceProduct()  +
                ", Вес товара: " + getWeightPieceProduct() + '}';
    }

}


//Упакованный товар
abstract class PackagedProduct extends Product{
    protected final ProductPackaging productPackaging;

    public PackagedProduct(String name, String description, ProductPackaging productPackaging) {
        super(name, description);
        this.productPackaging = productPackaging;
    }
    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    //Вес Нетто
    abstract public double getNetWeight();
    //Вес Брутто
    abstract public double getGrossWeight();
}

//Упакованный весовой товар
class PackagedWeightProduct extends PackagedProduct{
    private WeightProduct weightProducts;
    private double weight;

    public PackagedWeightProduct(ProductPackaging productPackaging, WeightProduct weightProduct, double weight){
        super(weightProduct.getNameWeightProducts(), weightProduct.getDescriptionWeightProducts(), productPackaging);
        this.weightProducts = weightProduct;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public Product getWeightProduct() {
        return weightProducts;
    }

    //массу нетто (только товара)
    @Override
    public double getNetWeight() {
        return weight;
    }

    //массу брутто (упаковки и товара вместе)
    @Override
    public double getGrossWeight() {
        return weight + productPackaging.getWeightPacking();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedWeightProduct)) return false;
        PackagedWeightProduct that = (PackagedWeightProduct) o;
        return Double.compare(that.getWeight(), getWeight()) == 0 && Objects.equals(getProductPackaging(),
                that.getProductPackaging()) && Objects.equals(getWeightProduct(), that.getWeightProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductPackaging(), getWeight(), getWeightProduct());
    }

    @Override
    public String toString() {
        return " Упакованный весовой товар: {" +
                " Имя товара: " + weightProducts.getNameWeightProducts() +
                ", Упаковка: " + productPackaging.getNamePacking() +
                ", Масса товара: " + weight +
                '}';
    }

}


//Упакованный штучный товар
class PackagedPieceProduct extends PackagedProduct{
    private  PieceProduct pieceProduct;
    private  int count;

    public PackagedPieceProduct(PieceProduct pieceProduct, ProductPackaging productPackaging, int count){
        super(pieceProduct.getNamePieceProduct(), pieceProduct.getDescriptionProduct(), productPackaging);
        this.count=count;
        this.pieceProduct=pieceProduct;
    }

    public int getCount() {
        return count;
    }
    public Product getPieceProduct(){
        return pieceProduct;
    }

    @Override
    public double getNetWeight(){
        return count*pieceProduct.getWeightPieceProduct();
    }

    @Override
    public double getGrossWeight(){
        return count*pieceProduct.getWeightPieceProduct() + productPackaging.getWeightPacking();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedPieceProduct)) return false;
        PackagedPieceProduct that = (PackagedPieceProduct) o;
        return getCount() == that.getCount() && Objects.equals(getProductPackaging(),
                that.getProductPackaging()) && Objects.equals(getPieceProduct(), that.getPieceProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductPackaging(), getCount(), getPieceProduct());
    }

    @Override
    public String toString() {
        return " Упакованный штучный товар: {" +
                " Имя товара: " + pieceProduct.getNamePieceProduct() +
                ", Упаковка: " + productPackaging.getNamePacking() +
                ", Всего товара: " + count +
                "}";
    }
}

//Партия товаров
 class ProductBatch {
    private final String description;
    private final PackagedProduct[] packagedProducts;

    public ProductBatch(String description, PackagedProduct[] packagedProducts) {
        this.description = description;
        this.packagedProducts = packagedProducts;
    }

    public String getDescription() {
        return description;
    }

    public PackagedProduct[] getProducts() {
        return packagedProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductBatch)) return false;
        ProductBatch that = (ProductBatch) o;
        return Objects.equals(getDescription(), that.getDescription()) && Arrays.equals(getProducts(), that.getProducts());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getDescription());
        result = 31 * result + Arrays.hashCode(getProducts());
        return result;
    }

    @Override
    public String toString() {
        return " Партия товаров: {" +
                " Описание: " + description +
                ", Товары: " + Arrays.toString(packagedProducts) +
                "}";
    }

    public static double getProductWeight(PackagedProduct[] packagedProducts) {
        return Arrays.stream(packagedProducts).mapToDouble(PackagedProduct::getGrossWeight).sum();
    }

    //масса брутто всех товаров с округлением до десятых
    public double getGrossWeight() {
        double grossWeight = getProductWeight(packagedProducts);
        double count = 10;
        return  Math.round(grossWeight * count) / count;
    }
}