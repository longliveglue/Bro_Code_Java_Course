package Bro.Inheritance;

public class Plant extends Organism{
    protected boolean inBloom;

    public Plant(boolean isAlivem, boolean inBloom){
        super(true);
        this.inBloom = inBloom;

    }

    public void photosyth(){
        System.out.println("Absorbing sunlight");
    }
}
