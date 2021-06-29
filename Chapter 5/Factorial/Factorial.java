
import java.util.*;
public class Factorial {
    public static int retFacto(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        else{
            return n * retFacto(n-1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and i will find it factorial: ");
        int i = input.nextInt();
        System.out.printf("The factorial of %d is %d ", i, retFacto(i));

    }
}