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
        Product[] products = {prod1, prod2, prod3, prod4, prod5};
        System.out.println(Arrays.toString(products));

        // Calcula la suma total de precios del array
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() != null)  // comprobación de nulos
             totalPrice += products[i].getPrice();
        }
        System.out.println("La suma de todos los precios es " + totalPrice);

        // Calcular la media de precio de los productos array
        double avgPrice =  totalPrice / products.length;
        System.out.println("La media del precio de los productos es de " + avgPrice);

        // Calcular el precio máximo
        double maxPrice = 0d;
        for (Product product: products) {
            if (product.getPrice() != null && product.getPrice() > maxPrice)  //compr. null && compara precios
                maxPrice = product.getPrice();
        }
        System.out.println("El precio máximo es " + maxPrice);
    }

}
