package Home2;

public  class Cow extends Pet{
	String name;

	public Cow(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void voice(){
		System.out.println("I am "+ name + " muuuuuuuuu");
	}

}
