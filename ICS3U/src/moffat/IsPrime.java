package moffat;

import java.util.Scanner;

/**
 * This number determines if a number is prime
 * May 20, 2016
 * @author Stuart Moffat
 *
 */

public class IsPrime {

	public static int userInput;
/**
 * Asks user for an integer, then calls isPrime method to determine if the integer is prime.
 * @param args
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		String runAgain;

		while (run == true)
		{			
		
			System.out.println("Enter an integer.");
			userInput = scan.nextInt();
		
			if (isPrime(userInput))
			{
				System.out.println(userInput + " is prime.");
			}
			else
			{
				System.out.println(userInput + " is not prime.");
			}
			
			scan.nextLine();
			System.out.println("Do you have another number?");
			runAgain = scan.nextLine();
			
			if (runAgain.equalsIgnoreCase("yes"))
			{
				run = true;
			}
			else 
			{
				run = false;
			}

		}
	}

	/**
	 * Checks if number is equal to 1 or 0.
	 * If not calls the method isDivisible to determine if the number is prime
	 * @param num int
	 * @return boolean
	 */
	public static boolean isPrime(int num)
	{
		if(num == 0 || num == 1)
		{
			return(false);
		}
		
		for(int i = 2;i < num; i++)
		{
			if(isDivisible(num, i) == true)
			{
				return (false);
			}
		}
		return(true);
	}
	
	/**
	 * Determines if the number is prime
	 * @param num int
	 * @param denominator int
	 * @return boolean
	 */
	public static boolean isDivisible(int num, int denominator) 
	{
		
		if(num % denominator != 0)
		{
			return (false);
		}
		
		return(true);
	
	}
		
	


}
