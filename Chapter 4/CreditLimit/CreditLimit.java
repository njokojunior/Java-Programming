import java.util.*;
    public class CreditLimit {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int i, initBalance, totalItem, totalCredit, creditLim;
            int id = 0;
            System.out.println("Welcome to my Credit limit java app.");
            System.out.printf("What do you want to do?\n1. Enter Customer info\n2. Quit\n");
            i = input.nextInt();
            while (i != 2) {
                System.out.print("Enter the Account Number: ");
                id = input.nextInt();
                System.out.print("Enter the Balance at the beginning ig the month: ");
                initBalance = input.nextInt();
                System.out.print("Enter the Total of all the Items charged by the customer this month: ");
                totalItem = input.nextInt();
                System.out.print("Enter the Total of all the Items for credit applied to the customer this month: ");
                totalCredit = input.nextInt();
                System.out.print("Enter the Allowed Credit Limits: ");
                creditLim = input.nextInt();
                System.out.printf("Customer New balance: %d", initBalance + totalItem - totalCredit);
                if (initBalance + totalItem - totalCredit > creditLim) {
                    System.out.println("\nCredit Limit exceeded");
                } else {
                    System.out.println("\nCredit Limit Not exceeded");
                }
                System.out.printf("What do you want to do?\n1. Enter Customer info\n2. Quit\n");
                i = input.nextInt();
                if (i == 2) {
                    break;
                }
            }
        }
    }