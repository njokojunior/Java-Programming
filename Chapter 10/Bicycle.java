public class Bicycle implements Tonnes {
    private double mile, tonnes;
    public Bicycle(double miles){
        mile = miles;
    }// Creating Default Constructor

    public void setMile(double miles) {
        if(miles >= 0.0) {
            mile = miles;
        }
        else{
           throw new IllegalArgumentException("Distance cannot be negative");
        }
    } // setting value of mile


    public double getMile() {
        return mile;
    } // returning value of mile
    // 0.621 mile of bicycle riding makes 0.00021 tonnes of CO2.
    // Mathematically, Xtonnnes = (0.00021 * mile) / 0.621
    public double getEmission() {
        tonnes = (0.00021 * mile) / 0.621;
        return tonnes;
    } // returning the number of tonnes
    @Override
    public String toString(){
        return String.format("******%s*****\n%s: %.1f\n%s: %.3f tonnes\n","Bicycle Emission", "Number of Miles", getMile(),
                "Carbon Emission in tones", getEmission());
    } // return string reperesentation of the object

    @Override //required method to deal with interface Tonnes
    public double getTonnes(){
        return getEmission();
    }
}