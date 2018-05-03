package car;

public class Wheel {
	private int diameter;
	private String name;
	
	public Wheel(int diameter, String name) {
	
		this.diameter = diameter;
		this.name = name;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", name=" + name + "]";
	}
	
	public void wheel(){
		System.out.println("You have "+diameter+" diameter wheels");
	}
	

}
