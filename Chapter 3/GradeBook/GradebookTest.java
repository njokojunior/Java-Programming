import java.util.Scanner; //importing java input library

public class GradebookTest{

public static void main(String[] args){ //main class

Scanner input = new Scanner(System.in); // creating input

//creating object info

GradeBook info1 = new GradeBook(" "," ");

GradeBook info2 = new GradeBook(" "," ");

System.out.println("Welcome to my program");

//user prompt to input

System.out.println("Enter the Name of the firstbook");

//Reading input

String bookname = input.nextLine();

System.out.println("Enter the Name of the Instructor");

String instructor = input.nextLine();

//calling the function with argument for execution

info1.setBookName(bookname);

info1.setInstructor(instructor);

System.out.printf("\nFirst book Infos:\nBook Name: %s\nInstructor: %s\n",info1.getBookName(),info1.getInstructor());

//user prompt to input

System.out.println("Enter the Name of the Second book");

//Reading input

bookname = input.nextLine();

System.out.println("Enter the Name of the Instructor");

instructor = input.nextLine();

info2.setBookName(bookname);

info2.setInstructor(instructor);

//printing result

System.out.printf("First book Infos:\nBook Name: %s\nInstructor: %s",info2.getBookName(),info2.getInstructor());


}


}