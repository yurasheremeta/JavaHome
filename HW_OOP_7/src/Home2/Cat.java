package Home2;

public class Cat extends Pet {
	String name;
	
	public Cat(String name) {
		//super(name);
		this.name = name;
		
	}

	public void voice(){
		System.out.println("I am " + name +" meeeoooww");
	}

}
