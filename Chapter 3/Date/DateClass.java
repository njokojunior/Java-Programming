public class DateClass{

private int day,month,year; 

public DateClass(int d, int m, int y){

day = d;
month = m; 
year = y;

}

public void setDay(int d){

day = d;

}
public void setMonth(int m){

month = m;

}
public void setYear(int y){

year = y;

}
public int getDay(){

return day;

}
public int getMonth(){

return month;

}
public int getYear(){

return year;

}

public void displayMessage(){
 
System.out.printf( "%d %d %d!\n", getMonth(), getYear(), getDay());

} 
}