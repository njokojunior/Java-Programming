import java.util.Scanner; //importing java library

public class EmployeeTest{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

Employee employee1 = new Employee(" "," ",0.0); creating account oject

Employee employee2 = new Employee(" "," ",0.0);

double salary;

String first_name, last_name,name; 

System.out.println("Welcome to my java app");

System.out.println();

//taking Employee1 info

System.out.print("Enter Employee1 First name: ");

first_name = input.nextLine(); 

employee1.setFirstName(first_name);

System.out.println();

System.out.print("Enter Employee1 Last name: ");

last_name = input.nextLine(); 

employee1.setLastName(last_name);

System.out.printf("\n\n");

//Taking Employee2 info

System.out.print("Enter Employee2 First name: ");

name = input.nextLine(); 

employee2.setFirstName(name);

System.out.println();

System.out.print("Enter Employee2 Last name: ");

last_name = input.nextLine(); 

employee2.setLastName(last_name);

System.out.println();

//Taking Employees Salary

System.out.print("Enter Employee1 Salary: ");

salary = input.nextDouble();

employee1.setSalary(salary);

System.out.println();

System.out.print("Enter Employee2 Salary: ");

salary = input.nextDouble();

employee2.setSalary(salary);

System.out.printf("\n\n");

//Displaying Employee info

System.out.printf("Employee1: info\n\nFull Name: %s %s \n\n",employee1.getFirstName(), employee1.getLastName());

System.out.printf("%s %s Salary: %.2f\n\n", employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());

System.out.printf("Employee2: info\n\nFull Name: %s %s \n\n",employee2.getFirstName(), employee2.getLastName());

System.out.printf("%s %s Salary: %.2f\n\n", employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());




}
}