package home_work;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter count hours of working per day:  ");
		Salary salary = new Worker(scan.nextDouble());
		salary.salary();
		System.out.print(" Enter count hours of wrking per day and salary for 1 hour : ");
		Salary salary1 = new Worker_hours(scan.nextDouble() , scan.nextInt());
		salary1.salary();
	}
	

}
