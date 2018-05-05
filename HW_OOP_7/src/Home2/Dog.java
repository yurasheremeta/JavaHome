package Home2;

public class Dog extends Pet {
	String name;
	

	
	public Dog(String name ) {
	//	super(name);
		this.name = name;
		
	}



	public void voice(){
		System.out.println("I am "+ name+ ". Gav");
	}



}
