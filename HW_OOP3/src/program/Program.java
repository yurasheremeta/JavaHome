package program;

import java.util.Scanner;
import quadarte.Quadrate;
import rectangle.Rectangle;


public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and width: ");
		Rectangle rectangle = new Rectangle(scan.nextInt(),scan.nextInt());
		Quadrate quadrate = new Quadrate(2);
		rectangle.Output_Rect();
		quadrate.Output_Quadrate();
		System.out.println(rectangle.getPerimeter());
		System.out.println(rectangle.getSquare());
		System.out.println(quadrate.getPerimeter());
		System.out.println(quadrate.getSquare());
		
	}

}
