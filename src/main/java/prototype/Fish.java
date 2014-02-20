package prototype;

public class Fish extends Animal{
    public Fish(){
        this.type="fish";
    }
    @Override
    void name() {
       System.out.println("This is a fish");        
    }

}
