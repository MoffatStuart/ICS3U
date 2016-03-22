package moffat;

import java.util.Scanner;
/*Stuart Moffat
 * 22/03/2016
 * Program to discover if statements in Java
 */

public class IntegerIfStatement {

	public static void main(String[] args) {
		
		//Open Scanner
		Scanner scan = new Scanner(System.in);
		int integer;
		
		
		System.out.println("Please input an integer");
		
		//Inputed number is stored in variable "integer"
		integer = Integer.parseInt(scan.nextLine());
		
		//Analyze the number
		if (integer > 0)
		{
			System.out.println("The number is positive");
		}
		else 
		{
			System.out.println("The number is negative");
		}
		
		if ((integer % 7) == 0)
		{
			System.out.println("The number is divisible by 7");
		}
		else 
		{
			System.out.println("The number is not divisible by 7");
		}
	}

}
