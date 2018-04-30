package quadarte;

import rectangle.Rectangle;

public class Quadrate extends Rectangle {
	protected double side;
	
	public Quadrate (){
		
	}

	public Quadrate(double side) {
	
		this.side = side;
		this.perimeter = side *4;
		this.square = side*side;
		
	}

	public double getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	

	public void Output_Quadrate (){
		System.out.println("The side of Quadrat is "+ side);
		System.out.println("Perimeter is "+perimeter);
		System.out.println("Square is "+ square);
		
	}
	

}
