package factory;

public class FactoryExample {
    public static void main(String args[]){
        ShapeFactory factory=new ShapeFactory();
        Shape shape=factory.getShape("CIRCLE");
        shape.draw();
        shape=factory.getShape("RECTANGLE");
        shape.draw();
        shape=factory.getShape("SQUARE");
        shape.draw();
    }
}
