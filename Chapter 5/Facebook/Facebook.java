
public class Facebook {
    private double Population,Rate,PopIncrease,Bill,TwoBill,Month;
    public Facebook(double pop, double rate, double increase, double CountA, double CountB/*,double month*/){
        Population = pop;
        Rate = rate;
        PopIncrease = increase;
        Bill = CountA;
        TwoBill = CountB;
        /*Month = month;*/
    }

    public void setPopulation(double pop){
        Population = pop;
    }
    public void setRate(double rate){
        Rate = rate;
    }
    public void setPopIncrease(double increase){
        PopIncrease = increase;
    }
    public void setBill(double countA){
         Bill = countA ;
    }
    public void setTwoBill(double CountB){
        TwoBill = CountB;
    }
  /*  public void setMonth(double month){
        Month = month;
    }*/

    public double getPopulation(){
        return Population;
    }
    public double getRate(){
        return Rate;
    }
    public double getPopIncrease(){
        return PopIncrease;
    }
    public double getBill(){
        return Bill;
    }
    public double getTwoBill(){
        return TwoBill;
    }
   /* public double getMonth(){
        return Month;
    }*/

    public void calculation() {
        while (Population <= 2999999999.9) {
            PopIncrease = Population * Rate;
            Population = Population + PopIncrease;
            if (Population >= 1000000000.0 && Population < 2000000000.0) {
                ++TwoBill;

            } else if (Population >= 2000000000.0 && Population <= 2999999999.9) {
                ++Bill;
            } else {
                ++Bill;
                ++TwoBill;
            }
        }
    }
    public void display(){
        System.out.printf("Facebook will take %.0f Months to reach 1 Billion users\n", getBill());
        System.out.printf("Facebook will take %.0f Months to reach 2 Billion users\n", getTwoBill());
    }


    public static void main(String[] args) {

        Facebook user1 = new Facebook(0.0,0.0,0.0,0.0,0.0/*0.0*/);
        double a = 500000000.0, b = 0.5, c = 0.0 , d = 0.0, e = 0.0/*,f = 0.0*/;
        user1.setPopulation(a);
        user1.setRate(b);
        user1.setPopIncrease(c);
        user1.setBill(d);
        user1.setTwoBill(e);
     //   user1.setMonth(f);
        user1.calculation();
        user1.display();
    }
}