package program;

import java.util.Scanner;
import quadarte.Quadrate;
import rectangle.Rectangle;


public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		Quadrate quadrate = new Quadrate();
		
		System.out.println("Enter length: ");
		rectangle.setLength(scan.nextInt());
		System.out.println("Enter width: ");
		rectangle.setWidth(scan.nextInt());
		rectangle.Output_Rect();
//		rectangle.Square();
//		rectangle.Perimeter();
		
		System.out.println("Enter side: ");
		quadrate.setSide(scan.nextInt());
		quadrate.Output_Quadrate();
//		quadrate.Perimeter_Quadrate();
//		quadrate.Square_Quadrate();
		
		
	}

}
