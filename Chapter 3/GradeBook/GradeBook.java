public class GradeBook{

private String name_book, instructor;

public GradeBook(String book_name, String course_instruct){

name_book = book_name; 

instructor = course_instruct;

}

public void setInstructor(String course_instruct){

instructor = course_instruct;

}

public void setBookName(String book_name){

name_book = book_name;

}

public String getInstructor(){

	return instructor;

}
public String getBookName(){

	return name_book;

}

public void displayMessages(){

System.out.printf("The course is: %s\nPresented by: %s\n",getInstructor(),getBookName());

}

}