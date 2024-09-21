package main.java;
import java.util.Scanner;

public class MainJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade sl = new Grade();
        Account ac = new Account();
        Product pd = new Product();
        
        String transaction;
        
        System.out.println("Product CRUD System\n");
        
        do {
            System.out.println("1. Grade");
            System.out.println("2. Account");  
            System.out.println("3. Product");
            System.out.println("Enter selection: ");
            
            int select = sc.nextInt();
            sc.nextLine();  
            
            switch(select) {
                case 1:
                    sl.calculateGrades();
                    break;
                case 2: 
                    ac.getAccounts();
                    break;
                case 3:
                    pd.getProduct();
                    break;
                default: 
                    System.out.println("Invalid choice.");
            }
            
            System.out.print("Make another transaction? (y/n): ");
            transaction = sc.next();
        } while(transaction.equalsIgnoreCase("y")); 
        
        sc.close();
    }
}
