package src.start.labs.app.application;

import src.start.labs.app.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with the product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        /*
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        */

        // Calling the Constructor of the Product class.
        Product product = new Product(name, price);

        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantityAdd = sc.nextInt();
        product.addProducts(quantityAdd);
        System.out.println("Updated data: " + product);
        System.out.print("Enter the number of products to be removed from stock: ");
        int quantityRem = sc.nextInt();
        product.removeProducts(quantityRem);
        System.out.println("Updated data: " + product);


        sc.close();
    }
}
