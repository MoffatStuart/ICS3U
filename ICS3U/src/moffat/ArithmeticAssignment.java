package moffat;

import java.util.Scanner;

/*Stuart Moffat
 * March 9th 2016
 * 
 */
public class ArithmeticAssignment {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		double num4;
		double num5;
		double sum;
		double difference;
		double product;
		double quotient;
		double remainder;
		double power;
		double sqrt;
		
		System.out.println("Please input a number.");
		num1 = Integer.parseInt(myInput.nextLine());
		
		System.out.println("Please input another number.");
		num2 = Integer.parseInt(myInput.nextLine());
		
		System.out.println("Please input another number.");
		num3 = Integer.parseInt(myInput.nextLine());
		
		System.out.println("Please input another number.");
		num4 = Integer.parseInt(myInput.nextLine());
		
		System.out.println("Please input your final number.");
		num5 = Integer.parseInt(myInput.nextLine());
		
		sum = num1 + num2 + num3 + num4 + num5;
		difference = num3 - num2;
		product = num1 * num5;
		quotient = num4 / num2;
		remainder = num4 % num2;			
		power = Math.pow(num1, num3);
		sqrt = Math.sqrt(num5);
				
		
		System.out.println("Sum = " + sum);
		System.out.println("Difference between 3rd and 2nd number: " + difference);
		System.out.println("Product of 1st and 5th number: " + product);
		System.out.println("Quotient of the 4th number divided the 2nd " + quotient + " Remainder: " + remainder);
		System.out.println("Number 1 to the power of Number 3: " + power);
		System.out.println("Square root of 5th number: " + sqrt);
		
		
		
		
		
		
		

	}

}
