package robot;

public class Program {
	public static void main(String[] args) {
		Robot skynet = new Robot("skynet");
		skynet.work();
		Robot yura = new CoffeRobot("Yura");
		yura.work();
		Robot terminator = new RobotDancer("Arnold");
		terminator.work();
		Robot ector = new RobotCoocker("Ector");
		ector.work();
		
	}

}
