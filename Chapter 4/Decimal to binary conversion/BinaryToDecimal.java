import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Power po = new Power(0,0,0);
        double number_of_digits,digit=0, number, count = 0,store = 0;
        System.out.println("Welconme to my java app to convert binarry numbers to Decimal numbers");
        System.out.println("Enter the number to Convert");
        number = input.nextInt();
        double initnmuber = number;
        System.out.println("Enter the number to digits the number has");
        number_of_digits = input.nextInt();
        while(count < number_of_digits){
            digit = number%10;
           // po.setPower(2,count,0);
            System.out.printf(" %.0f + (%.0f * %.0f) ",store,digit,Math.pow(2,count));
            store = store + (digit * Math.pow(2,count));
            System.out.printf(" = %.0f \n",store,digit,Math.pow(2,count));
            number = number/10;
            count++;
        }
        System.out.printf("The decimal equivalence of %.0f is %.0f ",initnmuber,store);
    }
}