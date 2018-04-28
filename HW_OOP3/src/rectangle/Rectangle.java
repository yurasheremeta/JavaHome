package rectangle;

import figure.Figure;

public class Rectangle extends Figure {
	protected int length;
	protected int width;
	
	public Rectangle (){
		
		super(0,0);
	}

	public Rectangle(double perimeter, double square , int length , int width) {
		super(perimeter, square);
		this.length = length;
		this.width = width;
		
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void Square(){
		square = length*width;
		System.out.println("Square is " + square);
		System.out.println(" ");
	}
	public void Perimeter(){
		perimeter = (length + width )*2;
		System.out.println("Perimeter is "+ perimeter);
		System.out.println(" ");
		
	}
	public void Output_Rect (){
		System.out.println("Length is "+ length);
		System.out.println("Width is "+ width);
		System.out.println(" ");
		Square();
		Perimeter();
	}
	
}
