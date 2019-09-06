public class Odometer {
    private double miles;
    private double mpg;
    public Odometer(){
        miles=0;
        mpg=1;
    }
    public void reset(){
        miles=0;
    }
    public void setMpg(double efficiency){
        mpg=efficiency;
    }
    public void drive(double distance){
        miles+=distance;
    }
    public void gasUsed(){
        System.out.println(miles/mpg);
    }
}
