package game;

public class Mine implements Building {
	public static final int COST = 60;
	public static final int COSTWORKER = 15;
	public static final int EFFICIENCY = 10;
	private int health;
	private Player player;
	private int lvl;

	public Mine(Player player) {
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
		player.addGold(EFFICIENCY * lvl);
		
	}
	public void upgrade(){
		lvl+=1;
		System.out.println("Yor level now: "+ lvl);
	
	}

}
