public class Ellipse implements GeometricObject {
    protected double r1;
    protected double r2;

    public Ellipse(double r1, double r2){
        this.r1 = r1;
        this.r2 = r2;
    }

    public double getArea(){
        return Math.PI * r1 * r2;
    }

    public double getPerimeter(){
        return 2 * Math.PI * (Math.sqrt(((r1 * r1) + (r2 *r2))/2));
    }
}