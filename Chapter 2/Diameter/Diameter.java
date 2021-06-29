import java.util.Scanner; //calling java library

public class Diameter{

public static void main(String[] args){

Scanner input = new Scanner(System.in); 

double r, pie = 3.14159; //declaring variables

//Asking user to enter r 

System.out.println("Enter the radius of the circle and i will find it diameter, Circumference and Area");

r = input.nextDouble();//reading input

//displaying output

System.out.printf("Diameter = 2 * radius, Diameter = %.2f\n", 2*r);

System.out.printf("Circumference = 2 * pie * radius, Circumference = %.2f\n", 2*pie*r);

System.out.printf("Area = pie * radius * radius, Area = %.2f\n", pie*r*r);

}
}