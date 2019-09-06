public class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double newlength){
        length=newlength;
    }
    public void setWidth(double newWidth){
        width=newWidth;
    }
    public double area(){
        return length*width;
    }
}
