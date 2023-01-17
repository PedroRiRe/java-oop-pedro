package product.example;

import java.util.Arrays;

public class ProductApp {


    public static void main(String[] args) {

        // Crea cinco productos
        Product prod1 = new Product("Laptop", 1495.99);
        Product prod2 = new Product("Shoes", 85.50);
        Product prod3 = new Product("Car", 23685.75);
        Product prod4 = new Product("TV", 3000d);
        Product prod5 = new Product("Smartphone", 789.95);

        // Crea un array de los productos
        Product[] arrayProduct = {prod1, prod2, prod3, prod4, prod5};
        System.out.println(Arrays.toString(arrayProduct));

        // Calcula la suma total de precios del array


    }

}
