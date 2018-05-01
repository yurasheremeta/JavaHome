package robot;

public class Robot {
	protected String name;
	
	public Robot(){
		
	}
	
	public Robot(String name) {
		
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void work(){
		System.out.println("I am "+ name +" I control everithing on this planet.");
		System.out.println("This three fucking robots tell you that they are working now");
		System.out.println("I will destroy them tomorow");
		
	}
	

}
