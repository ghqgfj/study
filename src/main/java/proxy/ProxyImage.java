package proxy;

public class ProxyImage implements Image {
	private RealImage image;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public void display() {
		if(image!=null)image.display();
		else{
			image=new RealImage(fileName);
			image.display();
		}
	}
}
