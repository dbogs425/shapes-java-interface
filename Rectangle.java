public class Rectangle implements GeometricObject {
    protected double length;
    protected double width;

    public Rectangle(double length){
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
}