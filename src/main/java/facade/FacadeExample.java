package facade;

public class FacadeExample {
	public  static void main(String[] args){
		ShapFacade facade=new ShapFacade();
		facade.drawCircle();
		facade.drawRectangle();
		facade.drawSquare();
	}
}
