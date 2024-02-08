package game;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		displayBoard board = new displayBoard();
		
		System.out.println("Welcome to Tic-Tac-Toe Game: ");
		System.out.println("");
		
		board.displayBoard();
		
	}
}