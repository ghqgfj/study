package bridge;

public class BridgeExample {
    public static void main(String args[]){
        Vehicle one=new Car(new Produce(),new Assemble());
        one.manufacture();
        Vehicle two=new Bike(new Produce(),new Assemble());
        two.manufacture();        
    }
}
