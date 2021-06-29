import java.util.Scanner;//calling java library

public class Oddeven{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number;//Declaring variables

//Asking user to input a number

System.out.println("Enter an integer and i will tell you whether it is even or odd ");

number = input.nextInt();//reading input

if(number%2==0){//if condition is true

System.out.printf("The number is even");

}

else{ //if condition is false

System.out.printf("The number is odd");

}

}

}