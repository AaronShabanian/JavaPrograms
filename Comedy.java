public class Comedy extends Movie {
    public Comedy(String rating, int id, String title){
        super(rating, id ,title);
    }

    public double calcLateFees(int days) {
        return days*2.5;
    }
}
