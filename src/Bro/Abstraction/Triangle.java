package Bro.Abstraction;

public class Triangle extends Shape{

    double base;
    double height;

    public Triangle(double base, double height){
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

}
