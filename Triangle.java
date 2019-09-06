public class Triangle extends Figure {
    public void erase(){
        System.out.println("Triangle erased");
    }
    public void draw(){
        System.out.println("Triangle has been drawn");
    }
    public void center(){
        System.out.println("Triangle center method has been called");
        erase();
        draw();
    }
}
