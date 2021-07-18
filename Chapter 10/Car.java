public class Car implements Tonnes {
    private double miles;
    private double mpg;
    private double tonnes;
    /*private final double diesel = 2.68;
    private final double petrol = 2.31;*/

    public Car (double mile,double mp){
        miles = mile;
        mpg = mp;
    }
    public void setMiles(double mile){
        if(mile >= 0.0){
            miles = mile;
        }
        else{
            throw new IllegalArgumentException("Sorry distance cannot be negative");
        }

    }
    public void setMpg(double mp){
        if(mp >= 0.0) {
            mpg = mp;
        }
        else {
            throw new IllegalArgumentException("Sorry Miles per gallons cannot be negative");
        }
    }
    public double getMiles(){
        return miles;
    }
    public double getMpg(){
        return mpg;
    }

    public String retString(double consumption){
        if(consumption == 1) {
            return "diesel";
        }
        else if(consumption == 2){
            return "petrol";
        }
        else{
            throw new IllegalArgumentException("Sorry you have to choose either Diesel or Gasoil");
        }
    }
    public double retTonne(double consumption){
        if(consumption == 1) {
            //the solution of miles * mpg gives the solution with unit as gallons
            // Multiplying by 4.533333 changes the unit to litres
            // Hence Multiplying the number of litres by the weight of a littre of diesel in kg gives the solution in kg
            // We then divide by 1000 and have our solution in tonnes
            tonnes = (((miles / mpg) * 4.533333) * 2.68)/1000;
            return tonnes;
        }
        else if(consumption == 2){
            tonnes = (((miles / mpg) * 4.533333) * 2.31)/1000;
            return tonnes;
        }
        else{
            throw new IllegalArgumentException("Sorry you have to choose either Diesel or Petrol");
        }
    }
    @Override// return string reperesentation of the object
    public String toString(){
        return String.format("*****%s*****\n%s: %.2f\n%s: %.2f\n%s: %s\n%s: %.2f","Car Emission","Miles",
                getMiles(), "Miles per gallon", getMpg(),"Consumes",retString(1),
                "Carbon Emission in tones", retTonne(1));
    }
    @Override//required method to deal with interface Tonnes
    public double getTonnes(){
        return retTonne(1);
    }

}