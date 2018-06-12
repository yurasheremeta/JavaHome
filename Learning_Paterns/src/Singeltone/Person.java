package Singeltone;

public class Person {
	private String name;
	private String lastname;
	private String gender;
	private int year;
	private int weight;
	
	public Person(){
		
	}

	public Person(String name, String lastname, String gender, int year,
			int weight) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.year = year;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", gender="
				+ gender + ", year=" + year + ", weight=" + weight + "]";
	}
	
	public static class Builder{
		private Person p;
		private static Builder instance = new Builder();
		
		private Builder(){
			p = new Person();
		}
		
		private Builder(Person p) {
			super();
			this.p = p;
		}
		public static Builder instance(){
			return instance;
		}
		
		public Builder create(){
			p = new Person();
			return this;
		}

	
		public Builder name(String name){
			p.name = name;
			return this;
		}
		public Builder lastname(String lastname){
			p.lastname = lastname;
			return this;
		}
		public Builder gender(String gender){
			p.gender = gender;
			return this;
		}
		public Builder year(int year){
			p.year = year;
			return this;
		}
		public Builder weight(int weight){
			p.weight = weight;
			return this;
		}
		
		public Person build(){
			return p;
		}
	
	}
	

}
