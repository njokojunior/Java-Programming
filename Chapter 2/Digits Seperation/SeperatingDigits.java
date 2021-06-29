import java.util.Scanner; //calling java library

public class SeperatingDigits{

public static void main( String[] args){

Scanner input = new Scanner(System.in);

//Asking user to input

System.out.println("Enter an integer with five digits and i will seperate it");

int digit;//Declaring variable

int i = input.nextInt(); //reading input

digit = i % 10;//storing the last digit of the number in the variable digit

i = i/10;  // eliminating the last digit so as to read the digit before the one eliminated 

System.out.printf("%d ",digit); //output eliminated digit

digit = i%10; 

i = i/10; 


System.out.printf("%d",digit); 

digit = i%10;

i = i/10;  

System.out.printf(" %d",digit); 

digit = i%10; 

i = i/10; 

System.out.printf(" %d",digit); 

digit = i%10;  

i = i/10; 

System.out.printf(" %d",digit); 




}

}