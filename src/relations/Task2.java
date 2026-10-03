package relations;

class Engine{
	public void engineStart() {
		System.out.println("Engine is started...");
	}
}

class Car{
	String name;
	String color;
	Engine engine = new Engine();
	
	public void startCar() {
		engine.engineStart();
		try {
			Thread.sleep(1000 );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Car is Started...");
	}
}

public class Task2 {
	public static void main(String[] args) {
		Car c = new Car();
		c.name = "Verna";
		c .color = "black";
		c.startCar();
	}
}
