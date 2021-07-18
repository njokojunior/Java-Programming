import java.util.*;

public class Building implements Tonnes {
    private int houshold;
    private double electricity, natauralGas, oil = 0, coal = 0, LPG,/* propane,*/ wood = 0, recycle;

    public Building(int members, double elec, double nat, double liq, double col, double Lpg /*double prop*/,
                    double fire, double recy){
        houshold = members;
        electricity = elec;
        natauralGas = nat;
        oil = liq;
        coal = col;
        LPG = Lpg;
        /*propane = prop;*/
        wood = fire;
        recycle = recy;
    }//creating constructor

    //function to set each private variables
    public void setHoushold(int members){
        if(members > 0.0) {
            houshold = members;
        }
        else{
            throw new IllegalArgumentException("Housholders must greater than 0");
        }
    }
    public void setElectricity(double elec){
        if(elec >= 0.0) {
            electricity = elec * 3240;
        }
        else{
            throw new IllegalArgumentException("Electricity reading must be positive");
        }
    }
    public void setNatauralGas(double nat){
        if(nat >= 0.0) {
            natauralGas = nat * 3240;
        }
        else{
            throw new IllegalArgumentException("Natural Gas value must greater than 0");
        }
    }
    public void setOil(double liq){
        if(liq >= 0.0 ) {
            oil = liq * 0.000984;
        }
        else {
            throw new IllegalArgumentException("Oil reading must greater than 0 or equal to 0");
        }
    }
    public void setCoal(double col){
        if(col >= 0.0) {
            coal = col / 1000;
        }
        else {
            throw new IllegalArgumentException("Coal reading must greater than 0 or equal to ");
        }
    }
    public void setLPG(double Lpg){
        if(Lpg >= 0.0) {
            LPG = Lpg * 0.000984;
        }
        else
        {
            throw new IllegalArgumentException("LPG reading must greater than 0 or equal to ");
        }
    }
/*    public void setPropane(double prop){
        if(prop >= 0.0) {
            propane = prop;
        }
        else{
            throw new IllegalArgumentException("Propane reading must greater than 0 or equal to ");
        }
    }*/
    public void setWood(double fire){
        if(fire >= 0.0) {
            wood = fire / 1000;
        }
        else{
            throw new IllegalArgumentException("Wood reading must greater than 0 or equal to ");
        }
    }
    public void setRecycle(double recy){
        if(recy >= 0.0) {
            recycle = recy  / 1000;
        }
        else{
            throw new IllegalArgumentException("Recycle reading must greater than 0 or equal to ");
        }
    }
    public void checkRecycle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Do you recycle glass, paper or metal? if yes enter Y else press N");
        char choice = input.next().charAt(0);
        if(choice == 'Y' || choice == 'y'){
            recycle = recycle - 0.07;
        }
        else if(choice == 'N' || choice == 'n'){
            recycle = recycle - 0;
        }
        else {
            throw new IllegalArgumentException("Invalid Input");
        }

        System.out.print("Do you recycle plastic apart from bags? if yes enter Y else press N");
        choice = input.next().charAt(0);
        if(choice == 'Y' || choice == 'y'){
            recycle = recycle - 0.14;
        }
        else if(choice == 'N' || choice == 'n'){
            recycle = recycle - 0;
        }
        else {
            throw new IllegalArgumentException("Invalid Input");
        }

    }


    //Function to get each private variables

    public int getHoushold(){
       return houshold;
    }
    public double getElectricity(){
        return electricity / houshold;
    }
    public double getNatauralGas(){
        return natauralGas / houshold;
    }
    public double getOil(){
        return oil / houshold;
    }
    public double getCoal(){
        return coal / houshold;
    }
    public double getLPG(){
        return LPG / houshold;
    }
   /* public double getPropane(){
        return propane;
    }*/
    public double getWood(){
        return wood / houshold;
    }
    public double getRecycle(){
        return recycle;
    }
    public double Total(){
        return getCoal() + getElectricity() + getLPG() + getRecycle() + getNatauralGas() + getOil() + getWood();
    }
    @Override
    public String toString(){
        return String.format("%s\n%s: %2d\n%s: %.2f\n%s: %.2f\n%s: %.2f\n%s: %.2f\n%s: %.2f\n" +
                        "%s: %.2f\n%s: %.2f",
                "***House Emission***", "Householders: ", getHoushold(), "Electricity", getElectricity(),
                "Natural gas", getNatauralGas(), "Heating Oil", getOil(), "Coal",getCoal(),
                "Liquid Petroleum gas (LPG)", getLPG(),"Wood", getWood(), "Recycling", getRecycle() );
    }
    @Override
    public double getTonnes(){
        return Total();
    }

}