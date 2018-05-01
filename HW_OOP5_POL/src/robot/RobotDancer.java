package robot;

public class RobotDancer extends Robot{
	protected String name;
	
	public RobotDancer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RobotDancer(String name) {
		super();
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
		System.out.println("I'm robot dancer.My name is "+name+" I'm dancing");
	}

	

}
