package factory;

public class Circle implements Shape{
	private String color;
	private int x;
	private int y;
	private int radius;
	public Circle(){};
	public Circle(String color){
		this.color=color;
	}
    public void draw() {
        System.out.println("Inside Circle::draw() method");
        System.out.println("[color: "+color+"; x: "+x+",y:"+y+";  radius:"+radius+"]");        
    }
    public void setX(int x){
    	this.x=x;
    }
    public void setY(int y){
    	this.y=y;
    }
    public void setRadius(int radius){
    	this.radius=radius;
    }
}
