import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

		printBoard(board);

		int movecount = 0;
		int currentplayer = 0;


		while (movecount < 9) {
			System.out.print("Player " + (currentplayer + 1) + " enter row number:");
			int row = reader.nextInt();
			System.out.print("Player " + (currentplayer + 1) + " enter column number:");
			int col = reader.nextInt();
			if (row <4 && row >0 && col <4 && col>0 && board[row - 1][col - 1] == ' ') {
				if (currentplayer == 0) {
					board[row - 1][col - 1] = 'X';

				}
				else {
					board[row - 1][col - 1] = 'O';
				}
				currentplayer = (currentplayer + 1) % 2;
				movecount++;
				printBoard(board);
				boolean win = checkboard(board, row -1, col -1);
				if (win){
					System.out.println("Player"+ (currentplayer +1) +" has won the game!");
					break;
				}
			}
			else{
				System.out.println("It's not a valid move.");
			}
		}

	}

	private static boolean checkboard(char[][] board, int row, int col) {
		char symbol = board[row][col];

		//check row of the last move
		boolean win = true;
		for (int i =0; i< 3; i++){
			if(symbol != board[row][i]){
				win = false;

			}
		}
		if(win){
			return true;
		}
		//check column of the last move
		win = true;
		for(int j=0; j<3; j++){
			if(symbol != board[j][col]){
				win = false;
			}
		}
		if (win){
			return true;
		}

		//top left to bottom right diagonal
		if (row==col){
			win = true;
			for (int i=0,j=0;j<3;i++, j++){
				if(symbol != board[i][j]){
					win = false;
				}
			}
			if(win){
				return true;
			}
		}
		//bottom left to top right diagonal
		if(row+col == 2){
			win = true;
			for(int i =2, j=0;j<3;i--,j++){
				if(symbol != board[i][j]){
					win = false;
				}
			}
			if(win){
				return true;
			}
		}

		return false;
	}


	public static void printBoard(char[][] board) {
		System.out.println("    1   2   3");
		System.out.println("   -----------");
		for (int row = 0; row < 3; ++row) {
			System.out.print(row + 1 + " ");
			for (int col = 0; col < 3; ++col) {
				System.out.print("|");
				System.out.print(" " + board[row][col] + " ");
				if (col == 2)
					System.out.print("|");

			}
			System.out.println();
			System.out.println("   -----------");

		}

	}

}