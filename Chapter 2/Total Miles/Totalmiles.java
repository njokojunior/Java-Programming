import java.util.Scanner;//calling java library

public class Totalmiles{

public static void main(String[] args)

{

int miles,gasoline,galon,parking,tolls;//declaring variables

Scanner input = new Scanner(System.in);

//Asking user to input values

System.out.printf("***Daily driving cost app**\nEnter the total miles driven per day: ");

miles = input.nextInt();//reading input

System.out.printf("\nEnter the Cost per gallon of gasoline: ");

gasoline = input.nextInt();

System.out.printf("\nEnter the Average miles per gallon: ");

galon = input.nextInt();

System.out.printf("\nEnter the Parking fees per day: ");

parking = input.nextInt();

System.out.printf("\nEnter the tolls per day: ");

tolls = input.nextInt();

//displaying result

System.out.printf("Your Daily driving cost is: %d", miles+gasoline+galon+parking+tolls);

}

}