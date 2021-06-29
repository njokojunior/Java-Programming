import java.util.*;

public class ProductOfOdd {
    public static void main(String[] args) {
        int store = 1, i;
        System.out.print("Calculating the products of odd numbers from 1 to 15: ");
        for (i = 1; i <= 15; i += 2) {
            store = store * i;
        }
        System.out.printf("The Product is %d: ", store);
    }
}