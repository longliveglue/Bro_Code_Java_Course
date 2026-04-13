package Bro.SuperKeyword;

public class Person {
    // This will be the parent class

    protected String first;
    protected String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    public void showName(){
        System.out.println(this.first + " " + this.last);
    }

}
