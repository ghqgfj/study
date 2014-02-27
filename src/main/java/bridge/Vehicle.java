package bridge;

public abstract class Vehicle {
    protected WorkShop work1;
    protected WorkShop work2;
    public Vehicle(WorkShop one,WorkShop two){
        this.work1=one;
        this.work2=two;
    }
    abstract public void manufacture();
}
