package game;

public class SawmillWorker implements Worker {
	private int health;
	private Player player;
	private int count;
	private int lvl;
	public SawmillWorker(Player player) {
		this.player = player;
		health = 100;
		count = 100;
		lvl = 1;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void Work(){
		player.addWorker(lvl * 2);
	}
	
	

}



