package main.java;
public class products {
  
  String productName;
  int quantity;
  int price;
 public void getProduct( String productName, int quantity, int price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public void Pd() {
        System.out.println("\n--- Product ---");
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("---------------\n");
    }
}