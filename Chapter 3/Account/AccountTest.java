import java.util.Scanner; //calling java library

public class AccountTest{

public static void main(String[] args)
{

Scanner input = new Scanner(System.in); 

Account account1 = new Account(0.0); //creating an object of the class account

Account account2 = new Account(0.0);

//Asking user to input to take a decision

System.out.printf("What do you want to do?\tpress 1 to deposit and 2 to withdraw\n");

System.out.printf("1. Deposit\n2. Withdraw\n");

int choice;//declaring variable choice for inputing user decision

double depositAmount, debitAmount;//Declaring doubles 

choice = input.nextInt();//reading choice

if(choice == 1){//checking condition

//if true execute

System.out.println("Which account do you want to deposit in?"); 

System.out.printf("1. Account1\n2. Account2\n");

choice = input.nextInt();

if( choice == 1){

System.out.printf("Account1 balance: %.2fCFA\n", account1.getBalance());

System.out.println("Enter the Amount to deposit");

depositAmount = input.nextDouble();

account1.amount(depositAmount);

System.out.printf("Amount deposited is: %.2fCFA\n", depositAmount);

//Calling account1 total balance

System.out.printf("Total amount is: %.2fCFA",account1.getBalance());

}

else if(choice == 2){

System.out.printf("Account2 balance: %.2fCFA\n", account2.getBalance());

System.out.println("Enter the Amount to deposit");

depositAmount = input.nextDouble();

account2.amount(depositAmount);

System.out.printf("Amount deposited is: %.2fCFA\n", depositAmount);

System.out.printf("Total amount is: %.2fCFA",account2.getBalance());

}

else{

System.out.println("Ivalid input Exiting.....");


}


}

else if(choice == 2){//if condition is true execute

System.out.print("Which account do you want to debit in?\n"); 

System.out.printf("1. Account1\n2. Account 2\n");

choice = input.nextInt();

if( choice == 1){

System.out.printf("Account1 balance: %.2fCFA\n", account1.getBalance());

System.out.println("Enter the Amount to debit");

depositAmount = input.nextDouble();

account1.debit(depositAmount);

System.out.printf("Total amount is: %.2fCFA",account1.getBalance());

}

else if(choice == 2){

System.out.printf("Account2 balance: %.2fCFA\n", account2.getBalance());

System.out.println("Enter the Amount to debit");

depositAmount = input.nextDouble();

account2.debit(depositAmount);



System.out.printf("Total amount is: %.2fCFA",account2.getBalance());

}

else{

System.out.println("Ivalid input Exiting....");


}


}

else{//if non of the conditions are true

System.out.println("Ivalid input Exiting....");

}

}

}