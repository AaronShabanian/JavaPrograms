public class Tester {
    public static void main(String[] args) {
        Celebrity celebrity = new Celebrity("Lady Gaga");
        Fan justin = new Fan("Justin", "Los Angeles");
        Fan jacky = new Fan("Jacky", "New York");
        Business coke = new Business(10000);
        celebrity.Tweet("Im going on a cocacola sponsored tour");
        System.out.println("Tweet: " + celebrity.msg);
        System.out.println("Celebrity Budget "+celebrity.getCelebBuget());
        System.out.println("Cocacola budget "+coke.getBudget());
        if (celebrity.tour == true) {
            justin.reply("lady gaga");
            jacky.reply("Lady gaga");
        }
        justin.update(celebrity.msg);
        jacky.update(celebrity.msg);
        coke.update(celebrity.msg);

    }
}
