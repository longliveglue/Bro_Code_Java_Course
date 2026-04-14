package Bro.ToStringOverride;

// .toString() = Method inherited from the Object Class.
// Used to return a string representation of an object.
// By default, it returns a hash code as unique identifier.
// It can be overridden to provide meaningful details.


public class main {
    public static void main(String[] args){

        Car car1 = new Car("Cupra", "Born", 2025, "Black" );

        Car car2 = new Car("BMW", "X3", 2013, "Black" );
        System.out.println(car1);
        System.out.println(car2);


    }

}
