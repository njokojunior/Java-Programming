import java.util.Scanner; //Import java library

public class InvoiceTest{

public static void main(String[] args){

Scanner input  = new Scanner(System.in); 

//creating object of the class Invoice

Invoice invoice = new Invoice(" "," ",0.00,0);

System.out.println("Welcome to my Invoice Program");

String id, descrip;

double price,amount;

//Asking user to input values

System.out.print("Enter the part number: "); 

id = input.nextLine(); 

System.out.print("Enter the description: "); 

descrip = input.nextLine();

System.out.print("Enter the Quantity needed: "); 

amount = input.nextDouble();

System.out.print("Enter the price: "); 

price = input.nextDouble(); 

invoice.setamount(amount);

invoice.setdescription(descrip);

invoice.setprice(price);

invoice.setid(id);

//Displaying values

System.out.printf("\nPart number: %s\n", invoice.getid());

System.out.printf("Description:\n%s\n", invoice.getdescription());

System.out.printf("Quantity: %.1f\n", invoice.getamount());

System.out.printf("Price: %.2f\n", invoice.getprice());

System.out.printf("Total: %.2f\n", invoice.getInvoiceAmount());

}


}