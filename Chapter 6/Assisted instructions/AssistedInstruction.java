import java.util.*;
public class AssistedInstruction {
    private static double  countCorrect, countWrong, num1, num2; // Declaring variables to be use in the whole class
    private static int level;
    public static void floor(){
        num1 = Math.floor(num1);
        num2 = Math.floor(num2);
    } // function to round up to 0 decimal places
    public static void setoperation(double choice){
        floor();
        if(choice == 1){

            System.out.printf("How much is %.1f + %.1f : ",num1,num2);
        }
        else if(choice == 2){
            System.out.printf("How much is %.1f - %.1f : ",num1,num2);
        }
        else if(choice == 3){
            System.out.printf("How much is %.1f * %.1f : ",num1,num2);
        }
        else{
            System.out.printf("How much is %.1f / %.1f : ",num1,num2);
        }
    }//Function to display question to user
    public static double getoperation( double choice){
        if(choice == 1){
            return num1 + num2;
        }
        else if(choice == 2){
            return num1 - num2;
        }
        else if(choice == 3){
            return num1 * num2;
        }
        else{
            return num1 / num2;
        }
    }//Function to return correct answer
    public static void correctResponse(int reply){
        switch (reply){
            case 1:
                System.out.println("Very Good!");
                break;
            case  2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice Work!");
                break;
            case 4:
                System.out.println("Keep up the good Work");
                break;
        }
    }//Function to display random message if answer is correct
    public static void wrongResponse(int reply){
        switch (reply){
            case 1:
                System.out.println("No please try again");
                break;
            case  2:
                System.out.println("Wrong. Try once more");
                break;
            case 3:
                System.out.println("Don't give up");
                break;
            case 4:
                System.out.println("No keep Trying");
                break;
        }
    }//Function to display random message if answer is wrong
    public static double percentage(double count){
        return (count/10.0) * 100.0;
    }//Function to display percentage pass
    public static double getCountCorrect(){
       return countCorrect;
    }// Function to count the number of correct answers
    public static double getCountWrong(){
       return countWrong;
    }// Function to count the number of wrong answers
    public static void getLevel(int a){
        Random ran = new Random();
        if(a == 1){
            num1 = (ran.nextDouble() * 10) + 0;
            num2 = (ran.nextDouble() * 10) + 0;
        }
        else if(a == 2)
        {
            num1 =   (ran.nextDouble() * 100) + 10;
            num2 =  (ran.nextDouble() * 100) + 10;
        }
        else if(a == 3){
            num1 = (ran.nextDouble() * 1000) + 100;
            num2 = (ran.nextDouble() * 1000) + 100;
        }
        else if(a == 4){
            num1 = (ran.nextDouble() * 1000) + 1000;
            num2 = (ran.nextDouble() * 1000) + 1000;
        }
        else{
            System.out.println("Wrong Input");
        }
    }//Function to identify the level and the number of digits to be use per level
    public static void random(){
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        double c;
        int i = 0;
            countCorrect = 0;
            countWrong = 0;
        System.out.println("Which Operation do you want to perform?");
        System.out.printf("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Perform random Operation\n");
        double check = input.nextDouble();
        System.out.printf("Choose Your level\n1. Level 1\n2. Level 2\n3. Level 3\n4. Level 4 (Max)\n");
        level = input.nextInt();
        double d;

            while(i < 10){
                getLevel(level);
                if(check == 5){
                   d = Math.floor((ran.nextDouble() * 5) + 1);
                    setoperation(d);
                }
                else{
                    d = check;
                    setoperation(d);
                }

                int response = 1 + ran.nextInt(4);
                c = input.nextDouble();
             if(c == getoperation(d)){
               correctResponse(response);
               ++countCorrect;
            }
            else{
                wrongResponse(response);
                ++countWrong;
            }
            i++;
            }
    }// Function gathering informations of above functions
    public static void displayInfo(){
        System.out.printf("You had: %.0f correct answers and %.0f wrong answers\n",getCountCorrect(),getCountWrong());
        if(percentage(countCorrect) < 75.0){
            System.out.printf("Your marks in percentage is %.1f\nPlease ask your teacher for extra help\n",percentage(countCorrect));
        }
        else{
            System.out.printf("Your marks in percentage is %.1f\nCongratulations, you are ready to go to the next level!\n",percentage(countCorrect));
        }
    } // Function to display info

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // creating object scanner to input
        int i = 0; // declaring variable i
        System.out.println("Welcome to my Multiplication Assited Program");
       do{

           random();
           displayInfo();
            System.out.println("press 1 to exit or any key to continue");
            i = input.nextInt();
        } while (i != 1);
    }
}