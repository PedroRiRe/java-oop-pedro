package product.example;


public class Product {

    private String name;
    private Double price;

    // Asociaciones de clases
    private String manufacturer;
    private Integer units;
    private ProductCategory category;



    public Product() {
    }

    public Product(String name, Double price, String manufacturer, Integer units, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.units = units;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", units=" + units +
                '}';
    }
}
