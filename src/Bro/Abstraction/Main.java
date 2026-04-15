package Bro.Abstraction;

public class Main {
    //Abstraction = Used to define abstract classes and methods.
    //Abstraction is the process of hiding implementation details.
    //and showing only the essential features:
    //Abstraction classes CAN'T be instantiated directly.
    //Can contain 'abstract' methods (which must be implemented).
    //Can contain 'Concrete' methods (which are inherited).

    public static void main(String[] args) {

        // We cannot create abstract items.
        // Things like Shapes don't actually exist. Squares, circles and triangles are shapes, but you cannot describe a shape.
        // Shape shape = new Shape();


        //We can create circle, triangle and rectangle classes
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle( 2, 2 );
        Rectangle rectangle = new Rectangle(2,2);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
        System.out.println();
        circle.display();
    }

}
