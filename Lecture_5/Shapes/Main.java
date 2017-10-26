package Shapes;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(1, 1, 7, 4, 4, 5);
        double area1 = triangle.getArea();
        double perimeter1 = triangle.getPerimeter();
        System.out.println("Площадь треугольника: " + format(area1) + " , периметр треугольника: " + format(perimeter1));


        Circle circle = new Circle(1, 1, 5, 5);
        double area2 = circle.getArea();
        double length2 = circle.getPerimeter();
        System.out.println("Площадь круга: " + format(area2) + " , длина окружности: " + format(length2));


        Rectangle rectangle = new Rectangle(0, 0, 5, 7);
        double area3 = rectangle.getArea();
        double perimeter3 = rectangle.getPerimeter();
        System.out.println("Площадь прямоугольника: " + format(area3) + " , периметр прямоугольника: " + format(perimeter3));


        Square square = new Square(0, 0, 5, 5);
        double area4 = square.getArea();
        double perimeter4 = square.getPerimeter();
        System.out.println("Площадь квадрата: " + format(area4) + " , периметр квадрата: " + format(perimeter4));

        Ellipse ellipse = new Ellipse(1, 1, 5, 7);
        double area5 = ellipse.getArea();
        double length5 = ellipse.getPerimeter();
        System.out.println("Площадь эллипса: " + format(area5) + " , длина окружности эллипса: " + format(length5));

    }

    private static String format(double x) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(x);
        return result;
    }
}
