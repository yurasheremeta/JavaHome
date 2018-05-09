package home_work;

import java.util.Scanner;

public class Worker_hours implements Salary{
	
	private double hours;
	private int salaryForHour ;
	//private Salary salary;
	
	public Worker_hours(){
		
	}
	
	
	public Worker_hours(double hours, int salaryForHour){//, Salary salary) {
		super();
		this.hours = hours;
		this.salaryForHour = salaryForHour;
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
		if(hours < 40){
			System.out.println("You must work not less 40 hours a week");
			System.out.println("Your salary per month is "+ hours * salaryForHour * 4);
		}else{
			salary = hours * salaryForHour *4;
			System.out.println("Your salary per month : "+ salary);
		}
		
	}
	

}
