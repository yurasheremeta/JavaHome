package Game;

import java.util.Scanner;

public class TicTacToe {
	static char[][] field = new char[3][3];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Game();
		

	}
	static void Draw(){
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				
				System.out.print(field[i][j]);
			}
			System.out.println(" ");
		}
		
		
	}
	static void Game(){
		for (int i = 0; i < 9; i++) {
			Draw();
			if(i%2==0){
				Player1();
			}else{
				Player2();
			}
			if(Check()){
				return;
			}
		}
		System.out.println("Nichuia");
	}
	
	static void Player1(){
	Scanner scan = new Scanner(System.in);
	System.out.println("It's time for Player 1: ");
		System.out.println("Input coordinates: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x<1 || x>3 || y<1 ||  y>3 ){
			System.out.println("Error! x & y must be from 1 to 3!!! ");
		}
		if(field[x-1][y-1] == 0){
			field[x-1][y-1] = 'X';
		}else {
			System.out.println("Error");
		}
		
	}
	static void Player2(){
		Scanner scan = new Scanner(System.in);
		System.out.println("It's time for Player 2: ");
			System.out.println("Input coordinates: ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x<1 || x>9 || y<1 ||  y>9 ){
				System.out.println("Error! x & y must be from 1 to 9!!! ");
			}
			if(field[x-1][y-1] == 0){
				field[x-1][y-1] = 'O';
			}else {
				System.out.println("Error");
			}
			
		}
	static boolean Check() {
		if(field[0][0] == field[0][1] && field[0][0] == field[0][2]){
			if(field[0][0] == 'X'){
				System.out.println("Congratulation!!!!! Player 1 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}else if (field[0][0] == 'O'){
				System.out.println("Congratulation!!!!! Player 2 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}
		}else if(field[1][0] == field[1][1] && field[1][0] == field[1][2]){
			if(field[1][0] == 'X'){
				System.out.println("Congratulation!!!!! Player 1 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}else if (field[1][0] == 'O'){
				System.out.println("Congratulation!!!!! Player 2 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}
		}else if(field[2][0] == field[2][1] && field[2][0] == field[2][2]){
			if(field[2][0] == 'X'){
				System.out.println("Congratulation!!!!! Player 1 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}else if (field[2][0] == 'O'){
				System.out.println("Congratulation!!!!! Player 2 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}
		}else if(field[0][0] == field[1][0] && field[0][0] == field[2][0]){
			if(field[0][0] == 'X'){
				System.out.println("Congratulation!!!!! Player 1 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}else if (field[0][0] == 'O'){
				System.out.println("Congratulation!!!!! Player 2 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}
		}else if(field[0][1] == field[1][1] && field[0][1] == field[2][1]){
			if(field[0][1] == 'X'){
				System.out.println("Congratulation!!!!! Player 1 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}else if (field[0][1] == 'O'){
				System.out.println("Congratulation!!!!! Player 2 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}
		}else if(field[0][2] == field[1][2] && field[0][2] == field[2][2]){
			if(field[0][2] == 'X'){
				System.out.println("Congratulation!!!!! Player 1 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}else if (field[0][2] == 'O'){
				System.out.println("Congratulation!!!!! Player 2 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}
		}else if(field[0][0] == field[1][1] && field[0][0] == field[2][2]){
			if(field[0][0] == 'X'){
				System.out.println("Congratulation!!!!! Player 1 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}else if (field[0][0] == 'O'){
				System.out.println("Congratulation!!!!! Player 2 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}
		}else if(field[0][2] == field[1][1] && field[0][2] == field[2][0]){
			if(field[0][2] == 'X'){
				System.out.println("Congratulation!!!!! Player 1 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}else if (field[0][2] == 'O'){
				System.out.println("Congratulation!!!!! Player 2 win!!! YAHOOOO!!!! ");
				Draw();
				return true;
			}
		} 
			return false;
		
		

	}

	
}
