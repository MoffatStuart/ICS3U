package moffat;
import java.util.Scanner;

/**
 * This program takes two numbers and processes them using math operations using methods.
 * May 20, 2016
 * @author Stuart Moffat
 * 
 */
public class MathMethodsProgram {

	/**
	 * Asks user for 2 numbers and calls 4 methods
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Please input a number");
		num1 = scan.nextDouble();
		System.out.println("Please input another number");
		num2 = scan.nextDouble();
		
		add(num1, num2);
		subtract(num1, num2);
		divide(num1, num2);
		multiply(num1, num2);
		

	}
	
	/**
	 * Takes the two inputed numbers, adds them, then outputs the answer
	 * @param numOne double
	 * @param numTwo double
	 */
	public static void add(double numOne, double numTwo)
	{
		double answer = numOne + numTwo;
		System.out.println(numOne + " + " + numTwo + " = " + answer);
		System.out.println("");
	}
	
	/**
	 * Takes the two inputed numbers, subtracts them, then outputs the answer
	 * @param numOne double
	 * @param numTwo double
	 */
	public static void subtract(double numOne, double numTwo)
	{
		double answer = numOne - numTwo;
		System.out.println(numOne + " - " + numTwo + " = " + answer);
		System.out.println("");
	}
	
	/**
	 * Takes the two inputed numbers, divides them, then outputs the answer
	 * @param numOne double
	 * @param numTwo double
	 */
	public static void divide(double numOne, double numTwo)
	{
		double answer = numOne / numTwo;
		System.out.println(numOne + " ÷ " + numTwo + " = " + answer);
		System.out.println("");		
	}
	
	/**
	 * Takes the two inputed numbers, multiplies them, then outputs the answer
	 * @param numOne double
	 * @param numTwo double
	 */
	public static void multiply(double numOne, double numTwo)
	{
		double answer = numOne * numTwo;
		System.out.println(numOne + " x " + numTwo + " = " + answer);
		System.out.println("");
	}

}
