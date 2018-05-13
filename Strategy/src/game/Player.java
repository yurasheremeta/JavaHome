package game;

public class Player {
	private String nick;
	private int gold;
	private int tree;
	private int worker;
	
	
	private Building[] buildings;
	private Worker[] workers;

	

	public Player(String nick) {
		this.nick = nick;
		gold = 100;
		tree = 10;
		worker = 1;
		buildings = new Building[50];
		workers = new Worker[100];
		
	}

	public int getGold() {
		return gold;
	}
	
	public int getWorker(){
		return worker;
	}

	public int getTree() {
		return tree;
	}

	public void addGold(int ammount){
		gold += ammount;
	}
	public void addWorker(int ammountWork){
		worker += ammountWork;
	}
	public void addTree(int ammountTree){
		tree += ammountTree;
	}
	public boolean takeTree(int ammountTree){
		if(tree >= ammountTree){
			tree -= ammountTree;
			return true;
			
		}else{
			return false;
		}
	}
	
	
	public boolean takeGold(int ammount){
			if(gold >= ammount){
				gold -= ammount;
				return true;
			}else{
				return false;
			}
			
		}
	public boolean takeWorkers(int ammountWork){
		if(worker >= ammountWork){
			worker -= ammountWork;
			return true;
		}else{
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
	public boolean addWorker(Worker worker){
		for (int i = 0; i < workers.length; i++) {
			if(workers[i] == null){
				workers[i] = worker;
				return true;
			}
		}
		return false;
	}
	public Building[] getBuildings() {
		return buildings;
	}
	public Worker[] getWorkers(){
		return workers;
	}

//	public boolean addWorker(SawmillWorker sawmillWorker){
//		for (int i = 0; i < workmans.length; i++) {
//			if(workmans[i] == null){
//				workmans[i] = sawmillWorker;
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean addWorkers(MineWorker mineWorker){
//		for (int i = 0; i < workmans.length; i++) {
//			if(workmans[i] == null){
//				workmans[i] = mineWorker;
//				return true;
//			}
//		}
//		return false;
//	}
	
	

}
