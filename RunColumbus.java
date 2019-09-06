public class RunColumbus {
    public static void main(String[] args) {
        Columbus game=new Columbus("Columbus","Jason","Jessica", "Santa Maria","nina","pinta");
        game.setBoatName();
        game.setPath();
        if(game.path==1)
            game.Path1();
        else if (game.path==2)
            game.Path2();
        else if(game.path==3)
            game.Path3();


    }
}
