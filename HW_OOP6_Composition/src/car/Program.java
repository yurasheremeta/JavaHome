package car;

public class Program {
	public static void main(String[] args) {
		Wheel wheel = new Wheel(16 , "Michelin");
		Helm helm = new Helm("Left");
		Body body = new Body("red" , "sedan");
		
		Car car = new Car(wheel , helm , body);
		
		System.out.println(car);
		car.side();
		car.getHelm().setSide("Right");
		System.out.println(car);
		car.side();
		car.color();
		car.wheel();
		System.out.println(car);
	}

}
