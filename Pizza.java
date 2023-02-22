
import java.text.DecimalFormat;
import java.util.Scanner;
public class Pizza {
    public static void main(String[] args) {
        Scanner Scan = new Scanner (System.in);

        DecimalFormat currencyFormat = new DecimalFormat("$0.00");
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        DecimalFormat percentFormat = new DecimalFormat("0.0");
        
        System.out.println(); 


        double medium_pizza_diameter = 12;
        double medium_pizza_radius = medium_pizza_diameter / 2 ; 
        double medium_area = Math.PI * (Math.pow(medium_pizza_radius, 2));
        System.out.println("Enter the price of a medium pizza:"); 
        double medium_price = Scan.nextDouble();
        double medium_price_per_inch = medium_price / medium_area;
        double two_medium_pizza_cost = medium_price * 2;
        System.out.println("The area of the medium pizza in inches is: " + decimalFormat.format(medium_area) );
        System.out.println("Price per square inch: " + currencyFormat.format(medium_price_per_inch)); 
        System.out.println(); 


        
        double large_pizza_diameter = 14;
        double large_pizza_radius = large_pizza_diameter / 2 ; 
        double large_area = Math.PI * (Math.pow(large_pizza_radius, 2));
        System.out.println("Enter the price of a large pizza:"); 
        double large_price = Scan.nextDouble();
        double large_price_per_inch = large_price / large_area;
        System.out.println("The area of the medium pizza in inches is: " + decimalFormat.format(large_area ));
        System.out.println("Price per square inch: " + currencyFormat.format(large_price_per_inch)); 

        double medium_percentage_of_large = medium_area / large_area * 100;
        double large_percentage_of_two_medium = large_area / (2 * medium_area) * 100;
    
        System.out.println(); 
        System.out.println("\nTwo medium pizzas cost: " + currencyFormat.format(two_medium_pizza_cost) + " dollars");
        System.out.println("One large pizza costs: " + currencyFormat.format(large_price) + " dollars");

        System.out.println("\nOne medium pizza is " + percentFormat.format(medium_percentage_of_large) + "% of one large pizza");
        System.out.println("One large pizza is " + percentFormat.format(large_percentage_of_two_medium) + "% of two medium pizzas");
    
        if (medium_price_per_inch < large_price_per_inch) {
            System.out.println("\nTwo medium pizzas is a more economical purchase.");
          } else {
            System.out.println("\nOne large pizza is a more economical purchase.");
          }
    
        
        
        
      
        

    }
    
}
