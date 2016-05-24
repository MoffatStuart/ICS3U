package moffat;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program takes two numbers and processes them using math operations using methods.
 * May 20, 2016
 * @author Stuart Moffat
 * 
 */
public class MathMethodsProgram {

	
	//Formats number to 2 decimal places
	public static DecimalFormat round = new DecimalFormat ("0.00");
	
	/**
	 * Asks user for 2 numbers and calls 4 methods
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Please input a number");
		num1 = scan.nextDouble();
		System.out.println("Please input another number");
		num2 = scan.nextDouble();
		
					
		System.out.println(num1 + " + " + num2 + " = " + round.format(add(num1, num2)));
		System.out.println("");
		System.out.println(num1 + " - " + num2 + " = " + round.format(subtract(num1, num2)));
		System.out.println("");
		System.out.println(num1 + " ÷ " + num2 + " = " + round.format(divide(num1, num2)));
		System.out.println("");
		System.out.println(num1 + " x " + num2 + " = " + round.format(multiply(num1, num2)));
		System.out.println("");

	}
	
	/**
	 * Takes the two inputed numbers, adds them, then outputs the answer
	 * @param numOne double
	 * @param numTwo double
	 */
	public static double add(double numOne, double numTwo)
	{
		double answer = numOne + numTwo;		
		return answer;
	}
	
	/**
	 * Takes the two inputed numbers, subtracts them, then outputs the answer
	 * @param numOne double
	 * @param numTwo double
	 */
	public static double subtract(double numOne, double numTwo)
	{
		double answer = numOne - numTwo;		
		return answer;
	}
	
	/**
	 * Takes the two inputed numbers, divides them, then outputs the answer
	 * @param numOne double
	 * @param numTwo double
	 */
	public static double divide(double numOne, double numTwo)
	{
		double answer = numOne / numTwo;		
		return answer;
	}
	
	/**
	 * Takes the two inputed numbers, multiplies them, then outputs the answer
	 * @param numOne double
	 * @param numTwo double
	 */
	public static double multiply(double numOne, double numTwo)
	{
		double answer = numOne * numTwo;		
		return answer;
	}

}
