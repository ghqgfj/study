package bridge;

public class Bike extends Vehicle{

    public Bike(WorkShop one, WorkShop two) {
        super(one, two);        
    }

    @Override
    public void manufacture() {
         System.out.println("Bike");
         work1.work();
         work2.work();
    }

}
