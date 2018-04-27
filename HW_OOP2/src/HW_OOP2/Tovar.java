package HW_OOP2;

public class Tovar {
	public String name;
	//public int count;
	public double price;
	public String country;

	public Tovar(){
		
	}
	public Tovar(String name, double price , String country) {
		
		this.name = name;
	
		this.price = price;
		this.country = country;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void Output(){
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Country: " + country);
		
	}
	
	

}
