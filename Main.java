import java.util.*;

public abstract class Main implements GeometricObject {
//Enter in some shapes and shit here

    public static void main(String [] args) {
        ArrayList<GeometricObject> gObs = new ArrayList<GeometricObject>();
        ArrayList<Resizable> res = new ArrayList<Resizable>();

        res.add(new ResizableSquare(4.00));
        gObs.add(new ResizableSquare(4.00));

        for (GeometricObject g :
                gObs) {
            System.out.println("Area of " + g + ": \n" + g.getArea() + "\n");
            System.out.println("Perimeter of " + g + ": \n" + g.getPerimeter() + "\n");
        }

        for (Resizable r : res) {
            gObs.add(r.resize(.7));
        }

        for (GeometricObject g :
                gObs) {
            System.out.println("Area of " + g + ": \n" + g.getArea() + "\n");
            System.out.println("Perimeter of " + g + ": \n" + g.getPerimeter() + "\n");

        }
    }
}