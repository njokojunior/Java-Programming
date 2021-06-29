import java.util.Scanner; //importing library for inputing values on the cmd line

public class Exercise{

public static void main(String[] args){

Scanner input= new Scanner(System.in);

int x,y,z,result;//declaring the 4 variables, result will store the product of the other numbers

System.out.println("Welcome to my program to find the product of 3 numbers"); 

System.out.print("Enter the first number: ");//asking user to input

x= input.nextInt();//reading values to be entered

System.out.print("Enter the second number: ");

y= input.nextInt();

System.out.print("Enter the third number: ");

z= input.nextInt();

result= x*y*z; //storing the product in result

//displaying output

System.out.printf("The prooduct of %d * %d *%d = %d",x,y,z,result);

}

}