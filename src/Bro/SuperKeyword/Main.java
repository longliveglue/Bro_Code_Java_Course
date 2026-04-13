package Bro.SuperKeyword;

public class Main {

    //super = Refers to the parent class when using inheritance (i.e Extends) (subclass <- superclass)
    //        Used in constructors and method overriding.
    //        Calls the parent constructor to initialize attributes.


    public static void main(String[] args){

        Person tom = new Person("Tom", "Riddle");
        tom.showName();

        Student harry = new Student("Harry", "Potter");

        Student ron = new Student("Ron", "Weasley", 130);
        harry.showName();

        ron.showName();
        Employee hagrid = new Employee("Rubeus", "Hagrid", 10000);

        hagrid.showName();
        hagrid.getSalary();
    }
}
