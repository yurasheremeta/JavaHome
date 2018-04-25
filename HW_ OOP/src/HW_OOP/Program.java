package HW_OOP;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input length: ");
		int length = scan.nextInt();
		System.out.println("Input width: ");
		int width = scan.nextInt();
		Rectangle rectangle = new Rectangle(length , width);
		rectangle.Draw();
		System.out.println("Square: " + rectangle.Square());
		System.out.println("Perimeter: " + rectangle.Perimeter());
		
		
		
	}

}
