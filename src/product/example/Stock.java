package product.example;

public class Stock {
    private Integer units;

    public Stock(Integer units) {
        this.units = units;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "units=" + units +
                '}';
    }
}
