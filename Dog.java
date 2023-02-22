import java.util.Scanner;
public class Dog {
    Scanner Scan = new Scanner (System.in);
    private String Name;
    private double Age;
public Dog() {
    System.out.print("Enter the dog's name: ");
    this.Name = Scan.nextLine();
    
    System.out.print("Enter the dog's age: ");
    this.Age = Scan.nextDouble();
}
public String getName(){
    return this.Name;
}
public void setName(String Name){
    this.Name = Name;
}
public double getAge(){
    return this.Age;
}
public void setAge(double Age){
    this.Age = Age;
}
public double AgeInPeopleYears(){
    return this.Age * 7;

}
public String DogResult(){
    return (this.Name + " is " + this.AgeInPeopleYears() + " years old in people years.");
}
}