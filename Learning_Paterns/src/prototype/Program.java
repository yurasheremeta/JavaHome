package prototype;

public class Program {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car prototype = new Car("Audi" , "" , 2018);
		System.out.println(prototype);
		
		Car car = (Car) prototype.clone();
		car.setModel("A8");
		System.out.println(car);
		
		Car car1 = prototype.copy();
		car1.setModel("A6");
		System.out.println(car1);
		
	}

}
