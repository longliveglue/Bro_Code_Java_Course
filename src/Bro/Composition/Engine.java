package Bro.Composition;

public class Engine {

String engineType;

public Engine(String engineType){
    this.engineType = engineType;
}

protected void start(){
    System.out.println("Engine is running");
}




}
