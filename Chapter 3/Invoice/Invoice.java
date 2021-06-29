
public class Invoice{

private String partnumber, description;

private double price, quantity; 

public Invoice(String id, String descrip, double cost, double amount){

partnumber = id; 

description = descrip;

price = cost; 

quantity = amount;

}

public void setamount(double amount){

if(quantity >= 0){

quantity = amount;

}

else{

quantity = 0;

}

}

public void setdescription(String descrip){

description = descrip;

}

public void setprice(double cost){

if(price >= 0){

price = cost;

}

else{

price = 0;

} 

}

public void setid(String id){

partnumber = id;

}

//getting functions

public double getamount(){

return quantity;

}

public String getdescription(){

return description;

}

public double getprice(){

return price;

}

public String getid(){

return partnumber;

}

public double getInvoiceAmount(){


return quantity*price;


}







}