package prototype;

public class Car implements Cloneable {
	private String make;
	private String model;
	private int year;
	
	public Car(){
		
	}

	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Car car = new Car(make,model,year);
		return car;
		
	}
	
	public Car copy(){
		return new Car(make,model,year);
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year
				+ "]";
	}
	
	

}
