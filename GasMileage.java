import java.util.Scanner;

public class GasMileage
{
//-----------------------------------------------------------------
// Calculates fuel efficiency based on values entered by the
// user.
//-----------------------------------------------------------------
public static void main(String[] args)
{
int miles, gallons;
float mpg; 
Scanner scan = new Scanner(System.in);

System.out.print("Enter Expected MPG: ");
mpg = scan.nextFloat();

System.out.print("Enter the number of miles: ");
miles = scan.nextInt();

System.out.print("Enter the gallons of fuel used: ");
gallons = scan.nextInt();

mpg = miles / gallons;
System.out.println("Miles Per Gallon: " + mpg);

mpg = (float) miles / gallons;
System.out.println("Miles Per Gallon: " + mpg);

}
}