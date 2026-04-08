package Bro.OOPConstructors;

public class Student {

    private String name;
    private int age;
    private double gpa;
    private boolean isEnrolled;

    public Student(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    public String toString() {
        String string = name + "," + age + "," + gpa + "," + isEnrolled;

        return string;
    }

}
