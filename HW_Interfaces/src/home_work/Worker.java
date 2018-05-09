package home_work;

public class Worker implements Salary {
	private double hours;
	private final double salaryForHour = 9;
//	private Salary salary;
	
	public Worker(){
		
	}
	


	public Worker(double hours){//, Salary salary) {
		super();
		this.hours = hours;
		//this.salary = salary;
	}



	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public void salary(){
		double salary;
		salary = hours * salaryForHour *4;
		System.out.println(salary + " Is your salary per month");
	}

}
