package Bro.SuperKeyword;

public class Employee extends Person{

    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    public void showName(){
        System.out.println(this.first + " " + this.last + " Salary is : $" + salary);
    }

    public void getSalary(){
        System.out.println("$" + salary);
    }
}
