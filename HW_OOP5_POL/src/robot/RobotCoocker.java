package robot;

public class RobotCoocker extends Robot {
	protected String name;
	
	
	public RobotCoocker() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RobotCoocker(String name) {
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
		System.out.println("I'm robot coocker.My name is "+name+" I'm cooking");
	}

}
