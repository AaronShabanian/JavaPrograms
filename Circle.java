public class Circle implements Shape {
    private double radius;
    public Circle(double rad){
        radius=rad;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRad){
        radius=newRad;
    }

    public double area() {
        return radius * radius * Math.PI;
    }
}
