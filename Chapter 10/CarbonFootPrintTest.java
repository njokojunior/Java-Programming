import java.util.*;

public class CarbonFootPrintTest {
    public static void main(String[] args){
        Tonnes[] carbonFootPrint = new Tonnes[3];
        carbonFootPrint[0] = new Building(2, 34.5, 30.5, 13.5, 5, 5, 14, 5);
        carbonFootPrint[1] = new Car(200, 25);
        carbonFootPrint[2] = new Bicycle(100);
        System.out.println("Building, Car and Bicycle processed Polymorphically");
        for(Tonnes tonnesEmission : carbonFootPrint ){
            System.out.printf("%s\n%s: %.2f\n", tonnesEmission.toString(),"Total Carbon Foot Print", tonnesEmission.getTonnes());
        }
    }
}