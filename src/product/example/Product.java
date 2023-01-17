package product.example;

public class Product {

    private Integer name;
    private Double price;

    public Product() {
    }

    public Product(Integer name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
