package product.example;

import java.util.Arrays;

public class ProductApp {


    public static void main(String[] args) {

        // Crea cinco productos
        Product prod1 = new Product("Laptop", 1495.99);
        Product prod2 = new Product("Shoes", 85.50);
        Product prod3 = new Product("Car", 23685.75);
        Product prod4 = new Product("SmartTV", 3000d);
        Product prod5 = new Product("Smartphone", 789.95);

        // Crea un array de los productos
        Product[] products = {prod1, prod2, prod3, prod4, prod5};
        System.out.println(Arrays.toString(products));

        // Estadisticas calculos
        ProductStats productStats = new ProductStats();

        double totalPrice = productStats.sumPrices(products);
        int count = productStats.count(products);
        double avgPrices = productStats.avgPrice(products);
        double maxPrices = productStats.maxPrices(products);
        double minPrices = productStats.minPrice(products);
        double stockPrices = productStats.sumPricesByQuantity(products);

        // Estadistica imprimir

        System.out.println("Precio medio de los productos: " + avgPrices);
        System.out.println("El producto más barato cuesta " + minPrices + "€");
        System.out.println("Nuestro producto más caro vale " + maxPrices + "€");
        System.out.println("El precio total del stock es " + stockPrices);

    }

}
