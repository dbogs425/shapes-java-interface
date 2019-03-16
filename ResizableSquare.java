public class ResizableSquare extends Square implements Resizable {
    protected double side;
    protected Square square;

    public ResizableSquare(double side) {
        super(side);
        this.side = side;
        this.square = new Square(this.side);
    }

    public Square resize(double percent) {
        var newSide = this.side * percent;
        return this.square = new Square(newSide);
    }
}
