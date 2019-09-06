import java.util.Random;

public class LoadedDice extends Random {
    private Random random;
    public LoadedDice(){
        random=new Random();
    }
    public int nextInt(int n) {
        int randomValue = random.nextInt(2);
        switch (randomValue) {
            case 1:
                return random.nextInt(n - 1);
            default:
                return n - 1;
        }
    }
    public void printDiceRolls() {
        for (int i = 0; i < 50; i++) {
            System.out.println(random.nextInt(6) + 1);
        }
    }
}




