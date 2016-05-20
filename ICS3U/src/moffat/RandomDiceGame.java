package moffat;

import java.util.Scanner;

public class RandomDiceGame {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean playAgain = true;
		String userChoice;
		int dieOne;
		int dieTwo;
		int userScore;
		int computerScore;

		// Loop for whole game
		while (playAgain == true) {

			// Roles die for computer and user
			dieOne = (int) (Math.random() * 6) + 1;
			dieTwo = (int) (Math.random() * 6) + 1;

			userScore = dieTwo + dieOne;

			dieOne = (int) (Math.random() * 6) + 1;
			dieTwo = (int) (Math.random() * 6) + 1;

			computerScore = dieOne + dieTwo;

			// Outputs results of the game
			System.out.println("Computer Score: " + computerScore);
			System.out.println("User Score: " + userScore);

			// Calculates winner and loser
			if (computerScore > userScore) {
				System.out.println("The computer wins");
			} else {
				System.out.println("YOU WIN!!!");
			}

			// Play again or end game
			System.out.println("Would you like to play?");
			userChoice = scan.nextLine();

			if (userChoice.equals("Yes")) {
				playAgain = true;
			} else if (userChoice.equals("yes")) {
				playAgain = true;
			} else {
				playAgain = false;
			}

		}
	}

}
