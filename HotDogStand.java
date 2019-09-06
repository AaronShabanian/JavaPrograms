public class HotDogStand {
    public int id;
    private int hotdogs;
    public static int total=0;
    public HotDogStand(int id,int hotdogs){
        this.id=id;
        this.hotdogs=hotdogs;
        total+=hotdogs;
    }
    public void JustSold(){
        hotdogs++;
        total++;
    }
    public int NumSold(){
        return this.hotdogs;
    }
    public static int totalcount(){
        return total;
    }


}
