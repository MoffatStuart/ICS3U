package moffat;

import java.util.Scanner;

public class RandomDiceGame {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int dieOne;
		int dieTwo;
		int userScore;
		int computerScore;
		
		dieOne = (int)(Math.random() * 6) + 1;
		dieTwo = (int)(Math.random() * 6) + 1;
		
		userScore = dieTwo + dieOne;
		
		dieOne = (int)(Math.random() * 6) + 1;
		dieTwo = (int)(Math.random() * 6) + 1;
		
		computerScore = dieOne + dieTwo;
		
		System.out.println("Computer Score: " + computerScore);
		System.out.println("User Score: " + userScore);
		
		if (computerScore > userScore)
		{
			System.out.println("The computer wins");
		}
		else
		{
			System.out.println("YOU WIN!!!");
		}

	}

}
