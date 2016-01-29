
public class Shirt implements Moveable{
	
	protected String brand;
	protected double size;
	protected String color;
	
	public Shirt(String brand, double size, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
	}

	public void move(String destination) {
		System.out.println(color + " " + size + " " + brand + " will be moved to " + destination);
	}

}
