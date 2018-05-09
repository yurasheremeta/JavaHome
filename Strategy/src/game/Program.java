package game;

import java.util.Scanner;

public class Program {
	private static Scanner scan;
	private static Player player;
	
	public static void main(String[] args) {
		initGame();
		while(true){
			printMenu();
			String choice = scan.next();
			switch(choice){
			case "1":
				addBuilding();
				break;
			case "2":
				activateBuilding(); 
				break;
			case "3":
				break;
				default :
					System.out.println("Goodbay");
					return;
			}
			
			
		}
	}
	
	public static void initGame(){
		scan= new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("Enter your nickname: ");
		player = new Player(scan.next());
	}
	
	public static void printMenu(){
		System.out.println("g = "+player.getGold());
		System.out.println("1 - add Building");
		System.out.println("2 - activate building ");
		System.out.println("3 - upgrade building");
		
		System.out.println("other - exit");
	}
	
	public static void addBuilding(){
		System.out.println("1 - mine("+Mine.COST+" g)");
		String choise = scan.next();
		switch(choise){
		case "1":
			if(player.takeGold(Mine.COST)){
				player.addBuildings(new Mine(player));
				System.out.println("Mine created");
			}else {
				System.out.println("You do not have enough gold");
			}
			break;
			default:
				System.out.println("There is not such option");
		}
	}
	public static void printListBuildings(){
		Building[] b = player.getBuildings();
		for (int i = 0; i < b.length; i++) {
			if(b[i] != null){
				System.out.println(i + "-" + b[i]);
			}
		}
	}
	
	public static void activateBuilding(){
		printListBuildings();
		System.out.println("Enter index  - ");
		int i = scan.nextInt();
		Building[] b = player.getBuildings();
		if(i >= 0 && i<b.length && b[i] != null){
			b[i].activate();
		}else{
			System.out.println("Try one more time");
		}
	}
}
