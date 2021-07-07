package com.company;
import java.util.*;
public class Main {
    private static int[]  callerTel = {6,0,0,0,0,0,0,0,0};
    private static int emgcyLevel, emgcyType, number;
    private static String callerName, callerAddress, callerLocation,base;
    private static final Random random = new Random();
    private static final long millis = System.currentTimeMillis();
    private static final Date date = new Date(millis);
    public static void displayInfo(){

        System.out.println("****** Emergency Information ******");
        System.out.println("The emergency has been reported On: ");
        System.out.println(date);
        System.out.println("Emergency Detail");
        dispatchUnity();
        System.out.printf("****** Call Taker Information ******\nPhone Number: %d\nBase Station: %s\n\n",number,base);
        System.out.printf("****** Caller Information ******\nName: %s\nAddress: %s\n",callerName,callerAddress);
        System.out.printf("Location: %s\nTel: ",callerLocation);
        returnNumber();
        System.out.println();




    }
    public static void callerInfo(){
        Scanner input = new Scanner(System.in);
        String name,address,location;
        int level, type;
        System.out.println("What is your name?");
        name = input.nextLine();
        callerName = name;
        System.out.println("Please enter your address");
        address = input.nextLine();
        callerAddress = address;
        System.out.println("Please enter your current Location");
        location = input.nextLine();
        callerLocation = location;
        System.out.printf("Please choose the type of Emergency\n1. Fire\n2. Criminals, Thieves or Terrorist\n3. Health problem\n");
        type = input.nextInt();
        emgcyType = type;
        System.out.println("On a Ladder of 1 to 10 which mark can you give to the emergency level?");
        level = input.nextInt();
        emgcyLevel = level;
        if(level < 0 || level > 10){
            throw new IllegalArgumentException("Please the level is suppose to be between 1 to 10 inclusive");
        }
        for(int i = 1; i < callerTel.length; i++ ) {
            if (i == 1) {
                int a = 1 + random.nextInt(3);
                if (a == 1) {
                    callerTel[1] = 9;
                } else if (a == 2) {
                    callerTel[1] = 5;
                } else if (a == 3) {
                    callerTel[1] = 8;
                } else {
                    callerTel[0] = 2;
                    callerTel[1] = 2;
                    i = i + 1;
                }

            } else {
                callerTel[i] = 1 + random.nextInt(9);
            }
        }

    }
    public static void returnNumber() {
        for (int i = 0; i < callerTel.length; i++) {
            System.out.printf("%d", callerTel[i]);
            if (i == 2 || i == 5) {
                System.out.print("-");
            }
        }
    }
    public static void dispatchUnity(){
        //address, location, type of unity


        if(emgcyType == 1){
            System.out.printf("Fire Emergency\nResponse: Fire Extinguisher patrol is on their way to your Location\n");
        }
        else if(emgcyType == 2){
            System.out.printf("Criminal Emergency\nResponse: Police patrol is on their way to your Location\n");
        }
        else if(emgcyType == 3){
            System.out.printf("Health Emergency\nResponse: An Ambulance is on it's way to your Location\n");
        }
        else{
            throw new IllegalArgumentException("Response: Sorry your Emergency should be categorize under one of the points above");
        }

        System.out.printf("Emergency Level: %d\n",emgcyLevel);

    }
    /*public static void displayInfoTocallTaker(){
        System.out.println("Caller Phone number: (+237) ");
        for(int i = 0 ; i < callerTel.length; i++){
            System.out.printf("%d", callerTel[i]);
            if(i == 2 || i == 5){
                System.out.print("-");
            }
        }
        System.out.printf("Caller Address %s \n", callerAddress);
        System.out.printf("Emergency Location %s \n", callerLocation);


    }*/
    public static void setCallTakerInfo(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Which Base station is receiving the call? : ");
        base = input.nextLine();
        System.out.printf("Enter the Phone Number of the Base station receiving the call: (+237) ");
        number = input.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Please give your 911 Call Taker information before you continue");
        setCallTakerInfo();
        System.out.println("Hello! You just called the 911 identify your self and tell us what is your emergency");
        callerInfo();
        displayInfo();
    }
}
