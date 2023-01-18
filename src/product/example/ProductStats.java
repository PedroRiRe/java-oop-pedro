package product.example;

public class ProductStats {
    /*
    usar esta clase para limpiar el código de ProductApp
    creando aquí los métodos
     */

    public double sumPrices(Product[] products) {
        double sumPrices = 0d;

        for (int i = 0; i < products.length; i++)
            if (products[i].getPrice() != null)
                sumPrices += products[i].getPrice();

        return sumPrices;

        }

    public int count(Product[] products) {
        int count = 0;

        for (Product product : products)
            if (product.getPrice() != null)
                count++;

        return count;
    }

    public double avgPrice(Product[] products) {

        double totalPrices = this.sumPrices(products);
        int count = this.count(products);

        if (count <= 0)
            return 0d;
        return totalPrices / count;
    }

    public double maxPrices(Product[] products) {
        double maxPrices = 0d;

        for (Product product : products) {
            if (product.getPrice() != null && product.getPrice() > maxPrices)
                maxPrices = product.getPrice();
        }
        return maxPrices;
    }

    public double minPrice(Product[] products) {
        double minPrice = this.maxPrices(products);

        for (Product product : products) {
            if (product.getPrice() == null)
                continue;

                minPrice = Math.min(minPrice, product.getPrice());
        }
        return minPrice;
    }

    public double sumPricesByQuantity(Product[] products) {
        double totalPrice = 0d;

        for (Product product : products) {
            if (product.getPrice() == null || product.getUnits() == null)
                continue;
            double productPrice = product.getPrice() * product.getUnits();
            totalPrice += productPrice;
        }
        return  totalPrice;
    }

}
