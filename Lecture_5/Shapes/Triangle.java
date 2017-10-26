package Shapes;

public class Triangle extends Shape {

    protected int x1 = 0;
    protected int y1 = 0;

    protected int x2 = 0;
    protected int y2 = 0;

    protected int x3 = 0;
    protected int y3 = 0;

    protected double ab;
    protected double bc;
    protected double ac;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        ab = determineDistance(x1, y1, x2, y2);
        bc = determineDistance(x2, y2, x3, y3);
        ac = determineDistance(x1, y1, x3, y3);
    }

    @Override
    public double getPerimeter() {
        double perimeter = ab + bc + ac;
        return perimeter;
    }

    @Override
    public double getArea() {   // Расчет площади треугольника по формуле Герона
        double ahalfPerimeter = (ab + bc + ac)/2;
        double area = Math.sqrt(ahalfPerimeter*(ahalfPerimeter-ab)*(ahalfPerimeter-bc)*(ahalfPerimeter-ac));
        return area;
    }
}
