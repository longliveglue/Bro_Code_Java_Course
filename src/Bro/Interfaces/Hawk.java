package Bro.Interfaces;

public class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println(this.getClass().getSimpleName() + " On the hunt!");
    }
}
