import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Celebrity {
    public int celebBuget;
    public String msg;
    public String location;
    private List<Observer> fans;
    public boolean tour=false;
    public String celeb;

    public Celebrity(String celebrity){
        fans = new ArrayList<>();
        celeb=celebrity;
    }

    public void addObserver(Observer fan) {
        this.fans.add(fan);
    }

    public void removeObserver(Observer fan) {
        this.fans.remove(fan);
    }

    public void Tweet(String msg) {
        Scanner scanner=new Scanner(System.in);
        Business business= new Business(10000);
        System.out.println("Tweeting...");
        this.msg = msg;
        String lowermsg=msg.toLowerCase();
        if(lowermsg.contains("cocacola")) {
            business.budget = business.budget - 500;
            celebBuget+=250;
            System.out.println("Budgets have been adjusted accordingly");
        }
        if(lowermsg.contains("tour")) {
            tour=true;
        }

            for (int i = 0; i < fans.size(); i++){
            fans.get(i).update(msg);
        }
    }
    public int getCelebBuget(){
        return celebBuget;
    }
}

