package com.company;
import java.util.*;

public class Main {

    private static double[] storeRate = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};// array to store the total ratings given to each issue
    private static double[] userRate = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};//array to store the rate an issue receives
    public static double[] averageRate= {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};//array to store the average rating of each issue
    private static String[] topics = {"Political Issue","Corruption Issue","Pollution Issue","Criminal Issue","Environment Issue","Deforestation Issue","Educational Issue","Employment Issue","Development Issue","Global Warming Issue" };
    private static String[] importantCauses = {" "," "," "," "," "};
    private static double count = 1, Low = 0, High = 0;
    public static void totalUserRating(){
        // Storing the sum of the initial rate stored and the new rating
        for (int i = 0; i < topics.length;i++){
            storeRate[i] = storeRate[i]+userRate[i];
        }
    }//Function to store the rating of all the users
    public static double setRatingValue(int a){
        //checking condition and return a value if true
        switch (a){
            case 1:
                return 1.0;
            case 2:
                return 2.0;
            case 3:
                return 3.0;
            case 4:
                return 4.0;
            case 5:
                return 5.0;
            default:
                return 0.0;
        }

    }//Function to return the rating of each issue
    public static void rateAll(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < userRate.length; i++){
            System.out.printf("Enter the rating of No %d on the list of 10 Issues: \n",i+1);
            int c = input.nextInt();
            userRate[i] = setRatingValue(c);//Storing value return by displayRatingValue in userRate
        }
    }//Function to pass through the different causes and rate each of them
    public static void displayChosenCauses(){
        for(int i = 0; i < importantCauses.length; i++){//looping through array importantCauses
            System.out.printf("%d. %s %.1f\n",i+1,importantCauses[i],storeRate[i]/count);//printing each element of the array
        }
    }//Function to display the five issue chosen
    public static String retCause(int a){
        //Testing each condition and if true returns a string
        if(a == 1){
            return "Political Issue";
        }
        if(a == 2){
            return "Corruption Issue";
        }
        if(a == 3){
            return "Pollution Issue";
        }
        if(a == 4){
            return "Criminal Issue";
        }
        if(a == 5){
            return "Environment Issue";
        }
        if(a == 6){
            return "Deforestation Issue";
        }
        if(a == 7){
            return "Education Issue";
        }
        if(a == 8){
            return "Employment Issue";
        }
        if(a == 9){
            return "Development Issue";
        }
        if(a == 10){
            return "Global Warming Issue";
        }
        else{
            return "NULL";
        }
    }//Function to return each choosen issue
    public static void StoredCauses(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < importantCauses.length; i++) { //looping through array importantCauses
            System.out.printf("Choose Cause No %d: ",i+1);//prompting user to select issue i+1
            int c = input.nextInt();// Reading input
            importantCauses[i] = retCause(c); //storing the value return in retCause in the array index of importantCauses
        }
    }//Function to store the chosen issue in an array
    public static void displayTopicsList(){
        for(int i =0; i < topics.length; i++){
            System.out.printf("%d. %s",i+1,topics[i]);
            System.out.println("");
        }

    }//Function to display the list of issue
    public static void averageRating( ){
        for(int i = 0; i < averageRate.length; i++) {
            averageRate[i] = storeRate[i] / count;
        }
    }

    public static void display1(){
        averageRating();
        for(int i = 0; i < topics.length; i++){
            System.out.printf("%d. %s\t\t%.0f Star(s)\t\t%.2f\n",i+1,topics[i],storeRate[i],averageRate[i]);
        }
    }
    public static void display2() {
        for (int i = 0; i < storeRate.length; i++) {
            if(LowestTotalRate() == storeRate[i]) {

                System.out.printf(" %s has the Lowest rate which is: %.0f\n", topics[i], LowestTotalRate());
            }
            if(highestTotalRate() == storeRate[i]) {
                System.out.printf("%s has the Highest rate which is: %.0f\n", topics[i], highestTotalRate());
            }
        }
    }
    public static void countIncrement(){
        count = count + 1;
    }

    public static double LowestTotalRate(){
        Low = storeRate[0];
        for(int i = 0; i < storeRate.length; i++){
            if(storeRate[i] <= Low){
                Low = storeRate[i];
            }
        }
        return Low;
    }
    public static double highestTotalRate(){
        High = storeRate[0];
        for(int i = 0; i < storeRate.length; i++){
            if(High <= storeRate[i]){
                High = storeRate[i];
            }
        }
        return High;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice =0;
        do {

            System.out.println("Welcome to my Polling Program. Please Select 5 social issues among the one below");
            displayTopicsList();//showing list of issues
            StoredCauses();//choosing 5 issues
            System.out.println("Please rate each of the Issues following their respective numbers");
            rateAll();//rating each issues
            totalUserRating();
            //Displaying result
            System.out.println("Topics\t\t\t\tRatings\t\t\tAverage");
            display1();
            System.out.printf("----------------\nChosen Topics\n");
            displayChosenCauses();
            display2();
            System.out.printf("Do you want to continue ? press 1 if No else Press Any key\n");
            choice = input.nextInt();
            countIncrement();
        }while(choice != 1 );
    }
}
