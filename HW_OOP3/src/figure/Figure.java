package figure;

public class Figure {
	protected double perimeter;
	protected double square;
	
	public Figure(){
		
	}

	public Figure(double perimeter, double square) {
		
		this.perimeter = perimeter;
		this.square = square;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}
	

}
