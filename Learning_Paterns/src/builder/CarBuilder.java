package builder;



public class CarBuilder {
	private String make;
	private String model;
	private int year;
	//private static Builder = 
	
	public  CarBuilder make(String make){
		this.make = make;
		return this;
	}
	public CarBuilder model(String model){
		this.model = model;
		return this;
	}
	public CarBuilder year(int year){
		this.year = year;
		return this;
	}
	public CarBuilder create(){
		Car c = new Car(make,model,year);
		return this;
	}
	public Car build(){
		return new Car(make,model,year);
	}
	
	
	

}
