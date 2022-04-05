package practice.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		
		char[][] grid = {{' ', '|', ' ', '|', ' '}, 
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}, 
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '} 
		};
			
		while(true) {
			System.out.println("Enter a number 1-9");
			
			int userInput = scan.nextInt();
			markPos(grid, "user", userInput);
			
			int cpuInput = rnd.nextInt(9) + 1;
			markPos(grid, "cpu", cpuInput);
			
			showGrid(grid);
		}
	}
	
	public static void showGrid(char[][] grid) {
		for(char[] row: grid) {
			for(char col: row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	public static void markPos(char[][] grid, String user, int position) {
		
		char mark;
		
		if(user.equals("user"))
			mark = 'x';
		else
			mark = 'o';
		
		switch(position) {
		case 1: 
			grid[0][0] = mark;
			break;
		case 2: 
			grid[0][2] = mark;
			break;
		case 3: 
			grid[0][4] = mark;
			break;
		case 4: 
			grid[2][0] = mark;
			break;
		case 5: 
			grid[2][2] = mark;
			break;
		case 6: 
			grid[2][4] = mark;
			break;
		case 7: 
			grid[4][0] = mark;
			break;
		case 8: 
			grid[4][2] = mark;
			break;
		case 9: 
			grid[4][4] = mark;
			break;
		default:
			break;
		}
	}
	
	

}
