package game;

public class Sawmill implements Building {
	public static final int COST = 20;
	private final int EFFICIENCY = 2;
	private Player player;
	private int health;
	private int lvl;

	public Sawmill(Player player) {
		super();
		this.player = player;
		health = 100;
		lvl = 1;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	
	public void activate() {
		player.addTree(EFFICIENCY * lvl);
		
	}
	public void upgrade(){
		lvl += lvl;
		System.out.println("Your level is: "+lvl);
	}

}
