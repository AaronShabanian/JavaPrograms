public class Action extends Movie {
    public Action(String rating, int id, String title){
        super(rating, id ,title);
    }

    public double calcLateFees(int days) {
        return days*3.0;
    }
}
