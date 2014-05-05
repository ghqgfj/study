package facade;

import factory.Circle;
import factory.Rectangle;
import factory.Square;

public class ShapFacade {
	private Circle circle;
	private Rectangle rectangel;
	private Square square;
	public ShapFacade(){
		circle=new Circle();
		rectangel=new Rectangle();
		square=new Square();	
	}
	public void drawCircle(){
		circle.draw();
	}
	public void drawRectangle(){
		rectangel.draw();
	}
	public void drawSquare(){
		square.draw();
	}
}
