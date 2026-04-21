package Bro.Polymorphism;

public class Bicycle extends Vehicle{

    @Override
    void go(){
        System.out.println("You ride the bike");
    }

    public void wheelie(){
        System.out.println("You pop a wheelie");
    }

}
