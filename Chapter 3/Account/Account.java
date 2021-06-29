
public class Account{

private double balance; 

public Account(double intialBalance){

if(intialBalance>0.0)
{
	balance = intialBalance;

}

}

public void amount(double Amount)

{

balance = balance + Amount; 


}

public double getBalance(){

return balance;

}

public void debit(double Amount){

if(Amount>balance){

System.out.println("Debit amount exceeded account balance");

}

else{

balance = balance - Amount;
System.out.printf("You just debited %.2fCFA from your account",depositAmount);


}


}


}