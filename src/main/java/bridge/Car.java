package bridge;

public class Car extends Vehicle{

    public Car(WorkShop one, WorkShop two) {
        super(one, two);
        
    }

    @Override
    public void manufacture() {
        System.out.println("Car");
        work1.work();
        work2.work();
        
    }

}
