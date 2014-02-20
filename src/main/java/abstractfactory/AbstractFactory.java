package abstractfactory;

import factory.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String type);
    public abstract Color getColor(String color);
}
