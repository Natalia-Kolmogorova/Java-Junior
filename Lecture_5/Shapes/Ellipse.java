package Shapes;

public class Ellipse extends Circle {

    protected int x3;
    protected int y3;

    protected double ab;
    protected double ac;

    public Ellipse (int x1, int y1, int y2, int x3) {
        super(x1, y1, 0, y2);
        x2=x1;
        this.x3 = x3;
        this.y3 = y1;

        ab = determineDistance(x1, y1, x2, y2);
        ac = determineDistance(x1, y1, x3, y3);
    }

    @Override
    public double getArea() {
        double area = Math.PI*ab*ac;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = Math.PI*(ab+ac);
        return perimeter;
    }
}
