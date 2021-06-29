import java.util.Scanner; 

public class DateClassTest{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

DateClass Date = new DateClass(0,0,0);

int day,month,year; 

System.out.println("Welcome to my Java app to display a date");

System.out.print("Enter the Month: ");
month= input.nextInt(); 

if(month > 12 || month < 0){

System.out.printf("Invalid Month!\nPlease Enter a month between 1 to 12\n");

}
else{

Date.setMonth(month);

}

System.out.print("Enter the Day: ");
day = input.nextInt(); 

if(day > 31 || day < 0){

System.out.printf("Invalid Day!\nPlease Enter a day between 1 to 31\n");

}
else{

Date.setDay(day);

}


System.out.print("Enter the Year: ");
year = input.nextInt(); 


if(year < 0){

System.out.printf("Invalid Year!\nPlease Enter a year whoes value is positive\n");

}
else{

Date.setYear(year);

}

if(year < 0 || day < 0 || day > 31 || month > 12 || month <0){

System.out.printf("Error\nExiting.....\n");

}

else{

Date.displayMessage();

}

}

}