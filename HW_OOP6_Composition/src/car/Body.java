package car;

public class Body {
	private String color;
	private String body;
	
	public Body(String color, String body) {
		super();
		this.color = color;
		this.body = body;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Body [color=" + color + ", body=" + body + "]";
	}
	public void color(){
		System.out.println("Your car is " + color);
	}
	
	

}
