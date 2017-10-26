package Shapes;

public abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();


    public double determineDistance (int x1, int y1, int x2, int y2) {                // Расчет расстояния от одной точки до другой
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return distance;
    }

}

