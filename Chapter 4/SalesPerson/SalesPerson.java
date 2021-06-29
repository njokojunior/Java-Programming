import java.util.*;

public class SalesPerson {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double salary = 200, precententage = 0.9, store=0.0;
        System.out.println("Welcome to my Java App to calculate a sales person earning");
        System.out.printf("What do you want to do?\n1. Find Sales person earning\n2. Quit\n");
        int choice = input.nextInt();
        int repeat = 1;
        while(choice == 1){
            store =0.0;
            while(repeat == 1) {
                System.out.print("Which item do you want to sell?: ");
                int item = input.nextInt();
                if (item == 1) {
                    store = store + 239.99;
                }
                if (item == 2) {
                    store = store + 129.75;
                }

                if (item == 3) {
                    store = store + 99.95;
                }

                if (item == 4) {
                    store = store + 350.89;
                }
                System.out.print("Enter 1 to add another item. else enter any number: ");
                repeat = input.nextInt();
            }
            System.out.println();
            store = 200 + (precententage * store);
            System.out.printf("Total earning of this sale person is: %.2f\n",store);
            System.out.print("Enter 1 to find another sales person earning. else enter 2 to quit ");
            choice = input.nextInt();

        }


    }
}