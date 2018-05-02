package car;

public class Helm {
	private  String side;

	public Helm(String side) {
		super();
		this.side = side;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Helm [side=" + side + "]";
	}
	public  void side(){
		if(side == "Right"){
			System.out.println("Car is from England or Austrlia");
		}else if(side == "Left"){
			System.out.println("Car is from Europe or America");
		}
	}

}
