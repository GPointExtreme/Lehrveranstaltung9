
public class Car implements Moveable{
	
	protected String type;
	protected String color;
	protected double weight;
	
	public Car(String type, String color, double weight) {
		super();
		this.type = type;
		this.color = color;
		this.weight = weight;
	}

	public void move(String destination) {
		System.out.println(color + " " + type + " will be moved to " + destination);
	}

}
