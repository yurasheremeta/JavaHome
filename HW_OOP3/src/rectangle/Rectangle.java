package rectangle;

import figure.Figure;

public class Rectangle extends Figure {
	protected double length;
	protected double width;
	
	public Rectangle (){
		
	
	}

	public Rectangle(int length , int width) {
		this.perimeter = (length+width)*2;
		this.square = length*width;
		this.length = length;
		this.width = width;
		
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}


	public void Output_Rect (){
		System.out.println("Length is "+ length);
		System.out.println("Width is "+ width);
		System.out.println("Perimeter is  "+perimeter);
		System.out.println("Square is "+ square);
	
	}
	
}
