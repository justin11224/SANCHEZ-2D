package main.java;
import java.util.Scanner;
public class Product {
    public static void getProduct() {
        Scanner in = new Scanner(System.in);
        String productName;
        int quantity, price;
        
        System.out.println("Product Name:");
        productName = in.nextLine();
        System.out.println("Quantity:");
        quantity = in.nextInt();
        System.out.println("Price:");
        price = in.nextInt();
        
        products pd = new products();
        
        pd.getProduct(productName, quantity, price); 
        pd.Pd();
        
    }
    }