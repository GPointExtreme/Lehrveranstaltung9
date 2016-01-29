import java.util.ArrayList;
import java.util.HashMap;

public class LogisticManager {
	
	ArrayList<Moveable> list = new ArrayList<>();

	public LogisticManager(ArrayList<Moveable> list) {
		super();
		this.list = list;
	}
	
	public void moveAll(String destination) {
		for (Moveable moveable : list) {
			moveable.move(destination);
		}
	}
	
	public HashMap<String, Integer> getCarsByColor(ArrayList<Car> cars) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for (Car car : cars) {
			if(!map.containsKey(car.color)) {
				map.put(car.color, 1);
			}
			else {
				Integer value = map.get(car.color);
				map.put(car.color, value +1);
			}
		}
		return map;
	}
}
