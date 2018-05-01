package robot;

public class CoffeRobot extends Robot {
	protected String name;
	
	
	
	public CoffeRobot() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CoffeRobot(String name) {
		super(name);
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void work(){
		System.out.println("I am Coffe robot.My name is "+name+" I make coffe");
	}

}
