import java.util.Scanner; //calling java library

public class Arithmetic{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

double i,j; //declaring variables

System.out.printf("Welcome to my Arithmetic program to perform operations between 2 numbers\n");

System.out.print("Enter the first number: "); // Asking user to input

i = input.nextDouble(); // reading user input

System.out.print("Enter the second number: ");// Asking user to input

j = input.nextFloat();// reading user input

//displaying output

System.out.printf("The sum is: %.2f\nThe difference is: %.2f\n",i+j,i-j);

System.out.printf("The product is: %.2f\nThe quotient is: %.2f\n ",i*j,i/j);

}
}