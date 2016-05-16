package moffat;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring/initializing variables
				String[][] tttBoard = new String[3][3];
				boolean[][] checker = new boolean[3][3]; 
				tttBoard[0][0] = "";
				tttBoard[0][1] = "";
				tttBoard[0][2] = "";
				tttBoard[1][0] = "";
				tttBoard[1][1] = "";
				tttBoard[1][2] = "";
				tttBoard[2][0] = "";
				tttBoard[2][1] = "";
				tttBoard[2][2] = "";
				boolean win = false;
				int row;
				int column;
				boolean magicX = false;
				boolean magicO = false;
				
				Scanner scan = new Scanner(System.in);

				while (!win) 
				{
					if (!magicX)
					{	
						
					
						// Player One turn
						System.out.println("Player one where would you like to play? (e.g. 1 3)");

						row = scan.nextInt();
						column = scan.nextInt();

						if (!checker[row - 1][column - 1]) {
							
							checker[row -1][column - 1] = true;
						
							// Place X on board
							tttBoard[row - 1][column - 1] = "X";

							// Show tttboard on console
							System.out.println(tttBoard[0][0] + "\t" + tttBoard[0][1] + "\t" + tttBoard[0][2]);
							System.out.println(tttBoard[1][0] + "\t" + tttBoard[1][1] + "\t" + tttBoard[1][2]);
							System.out.println(tttBoard[2][0] + "\t" + tttBoard[2][1] + "\t" + tttBoard[2][2]);

							// Look to find a winner
							if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2] && !tttBoard[0][2].equals("")) 
							{
								System.out.println("Player 1 is the winner!");
								win = true;
							} 
							else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2] && !tttBoard[1][2].equals("")) 
							{						
								System.out.println("Player 1 is the winner!");
								win = true;
							} 
							else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2] && !tttBoard[2][2].equals("")) 
							{							
								System.out.println("Player 1 is the winner!");
								win = true;
							} 
							else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0] && !tttBoard[1][0].equals("")) 
							{							
								System.out.println("Player 1 is the winner!");
								win = true;
							} 
							else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2] && !tttBoard[1][2].equals("")) 
							{							
								System.out.println("Player 1 is the winner!");
								win = true;
							} 
							else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2] && !tttBoard[2][2].equals("")) 
							{						
								System.out.println("Player 1 is the winner!");
								win = true;
							} 
							else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2] && !tttBoard[2][2].equals("")) 
							{							
								System.out.println("Player 1 is the winner!");
								win = true;
							} 
							else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0] && !tttBoard[0][2].equals("")) 
							{							
								System.out.println("Player 1 is the winner!");
								win = true;
							} 
							else 
							{
								win = false;
							}
					
							// Check if game has no possible winners
							if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") && !tttBoard[0][2].equals("")
									&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("") && !tttBoard[1][2].equals("")
									&& !tttBoard[2][0].equals("") && !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) 
							{
								win = true;
								System.out.println("Cat's game!");
							}
							magicX = false;
						}
					
					else 
					{
						System.out.println("These coordinates are not valid, input a valid set.");
						magicX = true;
					}
				}					

					// Player 2 turn
					
					//Checks if x has already won
					if (!win && !magicX) 
					{ 
						System.out.println("Player two where would you like to play? (e.g. 1 3)");

						row = scan.nextInt();
						column = scan.nextInt();

						if (!checker[row - 1][column - 1]) {
						
							checker[row -1][column - 1] = true;
						
						
							// Place O on the board
							tttBoard[row - 1][column - 1] = "O";

							// Display tttboard to the console
							System.out.println(tttBoard[0][0] + "\t" + tttBoard[0][1] + "\t" + tttBoard[0][2]);
							System.out.println(tttBoard[1][0] + "\t" + tttBoard[1][1] + "\t" + tttBoard[1][2]);
							System.out.println(tttBoard[2][0] + "\t" + tttBoard[2][1] + "\t" + tttBoard[2][2]);

							// Look for any winners
							if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2] && !tttBoard[0][2].equals("")) 
							{								
								System.out.println("Player 2 is the winner!");
								win = true;
							} 
							else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2] && !tttBoard[1][2].equals("")) 
							{								
								System.out.println("Player 2 is the winner!");
								win = true;
							} 
							else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2] && !tttBoard[2][2].equals("")) 
							{								
								System.out.println("Player 2 is the winner!");
								win = true;
							} 
							else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0] && !tttBoard[1][0].equals("")) 
							{								
								System.out.println("Player 2 is the winner!");
								win = true;
							} 
							else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2] && !tttBoard[1][2].equals("")) 
							{								
								System.out.println("Player 2 is the winner!");
								win = true;
							} 
							else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2] && !tttBoard[2][2].equals("")) 
							{								
								System.out.println("Player 2 is the winner!");
								win = true;
							} 
							else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2] && !tttBoard[2][2].equals("")) 
							{							
								System.out.println("Player 2 is the winner!");
								win = true;
							} 
							else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0] && !tttBoard[0][2].equals("")) 
							{								
								System.out.println("Player 2 is the winner!");
								win = true;
							} 
							else 
							{
								win = false;
							}
						
							// Check to see if there is no way someone can win
							if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") && !tttBoard[0][2].equals("")
									&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("") && !tttBoard[1][2].equals("")
									&& !tttBoard[2][0].equals("") && !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) 
							{
								win = true;
							System.out.println("Cat's game!");
							}
							magicO = false;
						}
						else
						{
							System.out.println("These coordinates are not valid, please choose another");
							magicO = true;
						}
					}
				}

	}

}
