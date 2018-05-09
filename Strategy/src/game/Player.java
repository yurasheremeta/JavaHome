package game;

public class Player {
	private String nick;
	private int gold;
	
	private Building[] buildings;
	

	public Player(String nick) {
		this.nick = nick;
		gold = 100;
		buildings = new Building[50];
	}

	public int getGold() {
		return gold;
	}
	
	

	public void addGold(int ammount){
		gold += ammount;
	}
	
	public boolean takeGold(int ammount){
		if(gold >= ammount){
			gold -= ammount;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean addBuildings(Building building){
		for (int i = 0; i < buildings.length; i++) {
			if(buildings[i] == null){
				buildings[i] = building;
				return true;
			}
		}
		return false;
		
	}

	public Building[] getBuildings() {
		return buildings;
	}
	
	
	

}
