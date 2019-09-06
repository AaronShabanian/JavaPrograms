public class Business {
    public int budget;
    public Business(int budget){
        this.budget=budget;
    }
    public void update(Object msg) {
        System.out.println("Coke Got Tweet! "+ msg);
    }
    public int getBudget(){
        return budget;
    }
}
