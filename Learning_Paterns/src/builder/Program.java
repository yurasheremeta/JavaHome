package builder;

public class Program {
	public static void main(String[] args) {
		Car c = new Car("Audi" , "A4" , 2017);
		System.out.println(c);
		Car.Builder cb = new Car.Builder();
		
		Car c1= cb.make("Audi")
				.model("A5")
				.year(2018)
				.build();
		System.out.println(c1);
		
		
		
//		CarBuilder cb1 = new CarBuilder();
//		Car car = cb1.make("Audi").model("A5").year(2018).build();
//		System.out.println(car);
	}
	
	
	

}
