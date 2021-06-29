
public class Employee{

private String firstName, lastName; 

private double Salary;


public Employee(String first, String last, double income){

firstName = first;

lastName = last;

Salary = income;


}

public void setFirstName(String first){

firstName = first;

}

public void setLastName(String last){

lastName = last;

}

public void setSalary(double income){

if(Salary >= 0){

Salary = income;

}


}

public String getFirstName(){

return firstName;

}

public String getLastName(){

return lastName; 

}

public double getSalary(){

return Salary;

}

}
 