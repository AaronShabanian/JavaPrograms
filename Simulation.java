public class Simulation extends Game {
    private int games;
    public Simulation(int games){
        this.games=games;
    }
    public void stats() {
        int i = 0;
        int battles=0;
        int wars=0;
        int maxBattles=0;
        int minBattles=100000;
        int maxwars=0;
        int addBattles=0;
        while (i < games) {
            game();
            battles=one+two;
            addBattles+= one + two;
            i++;
            if(maxBattles<battles){
                maxBattles=battles;
            }
            if(minBattles>battles){
                minBattles=battles;
            }
        }
        double Averagebattles=(double)addBattles/(double)games;
        System.out.println("Average number of battles: "+ Averagebattles);
        System.out.println("Max Battles "+ maxBattles);
        System.out.println("Min Battles "+ minBattles);
        i=0;
        int addwars=0;
        int minwars=1000;
        while (i < games) {
            game();
            addwars+= this.wars;
            i++;
            if(this.wars>maxwars){
                maxwars=this.wars;
            }
            if(this.wars<minwars){
                minwars=this.wars;
            }
        }
        System.out.println("Minimum number of wars "+ minwars);
        System.out.println("Max number of wars "+ maxwars);
        double averagewars=0;
        averagewars=(double)addwars/(double)games;
        System.out.println("Average number of wars: "+ averagewars);
        i=0;
        while (i<games){
            game();
            doublecounter+=doublecounter;
            i++;
        }
        double doublewar;
        doublewar=(double)doublecounter/(double)games;
        System.out.println("Average number of double wars: "+doublewar);

    }
    public static void main(String[] args) {
        Simulation g=new Simulation(500000);
        g.stats();
    }
}
