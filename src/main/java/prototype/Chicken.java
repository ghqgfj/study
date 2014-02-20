package prototype;

public class Chicken extends Animal{
    public Chicken(){
        this.type="bird";
    }

    @Override
    void name() {
       System.out.println("This is a Chicken");        
    }
}
