import java.util.Scanner;//calling java library 

public class Large_Small{

public static void main(String[] args)

{

Scanner input = new Scanner(System.in);

int a,b,c,d,e; //declaring variables

//Asking user to input 5 integers

System.out.println("Enter five variables and i will found the largest and smallest number:");

a = input.nextInt();

b = input.nextInt();

c = input.nextInt();

d = input.nextInt();

e = input.nextInt();

//testing for the highest number

if(a>b&&a>c&&a>d&&a>e){

System.out.printf("%d is the largest number\n",a);

}
else if(b>a&&b>c&&b>d&&b>e){

System.out.printf("%d is the largest number\n",b);

}

else if(c>a&&c>b&&c>d&&c>e){

System.out.printf("%d is the largest number\n",c);

}

else if(d>a&&d>b&&d>e&&d>e){

System.out.printf("%d is the largest number\n",d);

}

else{

System.out.printf("%d is the largest number\n",e);

}

//testing for the lowest number

if(a<b&&a<c&&a<d&&a<e){

System.out.printf("%d is the smallest number\n",a);

}
else if(b<a&&b<c&&b<d&&b<e){

System.out.printf("%d is the smallest number\n",b);

}

else if(c<a&&c<b&&c<d&&c<e){

System.out.printf("%d is the smallest number\n",c);

}

else if(d<a&&d<b&&d<e&&d<e){

System.out.printf("%d is the smallest number\n",d);

}

else{

System.out.printf("%d is the smallest number\n",e);

}

}

}