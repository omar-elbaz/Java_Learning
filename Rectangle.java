import java.util.Scanner;


public class Rectangle {
    public static void main(String[] args) {
        Scanner Scan = new Scanner (System.in);

        System.out.println();
        System.out.println("Dimensions of a Rectangle");

        System.out.println("Enter the Length in Inches:"); 
        Integer rectangle_length = Scan.nextInt();

        System.out.println("Enter the Width in Inches"); 
        Integer rectangle_width = Scan.nextInt();

        Integer rectangle_area = rectangle_length * rectangle_width;
        System.out.println("The area of the rectangle is:"); 
        System.out.println(rectangle_area + " Inches");

    }
    
}
