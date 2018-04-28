package quadarte;

import rectangle.Rectangle;

public class Quadrate extends Rectangle {
	protected int side;
	
	public Quadrate (){
		
	}

	public Quadrate(double perimeter, double square, int length, int width , int side) {
		super(perimeter, square, length, width);
		this.side = side;
		
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	public void Perimeter_Quadrate(){
		perimeter = side*4;
		System.out.println("Perimeter of Quadrat is "+ perimeter);
		System.out.println(" ");
	}
	public void Square_Quadrate(){
		square = side*side;
		System.out.println("Square for Quadrate is  "+ square);
		System.out.println(" ");
		
	}
	
	public void Output_Quadrate (){
		System.out.println("The side of Quadrat is "+ side);
		System.out.println(" ");
		Perimeter_Quadrate();
		Square_Quadrate();
	}
	

}
