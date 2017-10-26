package Shapes;

public class Circle extends Shape {

    protected int x1;
    protected int y1;

    protected int x2;
    protected int y2;

    protected double radius;

    public Circle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        radius = determineDistance(x1, y1, x2, y2);
    }

    @Override
    public double getArea() { // Площадь круга
        double area = Math.PI * Math.sqrt(radius);
        return area;
    }

    @Override
    public double getPerimeter() {  // Длина окружности
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }
}
