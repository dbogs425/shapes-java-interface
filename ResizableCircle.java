public class ResizableCircle extends Circle implements Resizable {
    protected double radius;
    protected Circle circle;


    public ResizableCircle(double radius){
        super(radius);
        this.circle = new Circle(radius);
        this.radius = circle.radius;
    }

    public Circle resize(double percent){
        var newRadius = this.radius * percent;
        return this.circle = new Circle(newRadius);
    }
}
