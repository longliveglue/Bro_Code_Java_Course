package Bro.SuperKeyword;

public class Student extends Person {

    double gpa;

    Student(String first, String last) {
        super(first, last);

    }

    Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    public void showName(){
        System.out.println(this.first + " " + this.last + " GPA is: " + gpa);
    }

}
