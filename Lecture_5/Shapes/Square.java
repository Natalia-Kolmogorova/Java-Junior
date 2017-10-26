package Shapes;

public class Square extends Rectangle {

    protected double ab;

    public Square (int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, 0);
        y2 = y1;
        ab = determineDistance(x1, y1, x2, y2);
    }

    @Override
    public double getArea() {
        double area = ab*ab;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4*ab;
        return perimeter;
    }
}
