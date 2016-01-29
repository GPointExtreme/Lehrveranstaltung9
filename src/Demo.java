import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Car op1 = new Car("VW", "blue", 1200);
		Car op2 = new Car("Renault", "yellow", 1000);
		Shirt op3 = new Shirt("DC", 100, "blue");
		Shirt op4 = new Shirt("HM", 110, "yellow");
		
		ArrayList<Moveable> list = new ArrayList<>();
		
		LogisticManager manager = new LogisticManager(list);
		
		list.add(op1);
		list.add(op2);
		list.add(op3);
		list.add(op4);
		
		manager.moveAll("Graz");
		
		System.out.println("------------------------------------------------");
		
		ArrayList<Car> carList = new ArrayList<>();
		
		carList.add(op1);
		carList.add(op2);
		
		System.out.println(manager.getCarsByColor(carList));
		
	}

}
