package Shapes;

public class Rectangle extends Shape {

    protected int x1;
    protected int y1;

    protected int x2;
    protected int y2;

    protected int x3;
    protected int y3;

    protected int x4;
    protected int y4;

    protected double ab;
    protected double ac;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        this.x3 = x1;
        this.y3 = y2;

        this.x4 = x2;
        this.y4 = y1;

        ab = determineDistance(x1, y1, x3, y3);
        ac = determineDistance(x1, y1, x4, y4);
    }

    @Override
    public double getArea() {
        double area = ab * ac;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * (ab + ac);
        return perimeter;
    }
}
