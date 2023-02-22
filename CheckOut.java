import java.util.Scanner;

public class CheckOut {
    
    public static void main(String[] args) {
        final double SALES_TAX = 0.06625;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the product name: ");
            String product = input.nextLine();

            System.out.print("Enter the product category (B for Bakery, etc.): ");
            char category = input.nextLine().charAt(0);

            System.out.print("Enter the quantity: ");
            int qty = input.nextInt();

            System.out.print("Enter the unit price: ");
            float uc = input.nextFloat();

            double total = (qty * uc) + ((qty * uc) * SALES_TAX);

            System.out.println("Product Name: " + product + "\tCategory: " + category + "\tQuantity: " + qty + "\tUnit Price: " + uc + "\nYour Total is: $" + total);
        }
    }
}