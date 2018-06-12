package builder;

public class Car {
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
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year
				+ "]";
	}
	
	
	public static class Builder{
		private Car c;
		
		public Builder(){
			c = new Car();
		}

		public Builder(Car c) {
			super();
			this.c = c;
		}
		
		public Builder make(String make){
			c.make = make;
			return this;
		}
		public Builder model(String model){
			c.model = model;
			return this;
		}
		public Builder year(int year){
			c.year= year;
			return this;
		}
		
		public Car build(){
			return c;
		}
	}
	

}
