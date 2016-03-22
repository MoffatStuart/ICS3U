package moffat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat round = new DecimalFormat("0.0");

		double a;
		double b;
		double c;
		double discriminant;
		double plusAnswer;
		double minusAnswer;

		System.out.println("Please input the a value");
		a = Double.parseDouble(scan.nextLine());
		System.out.println("Please input the b value");
		b = Double.parseDouble(scan.nextLine());
		System.out.println("Please input the c value");
		c = Double.parseDouble(scan.nextLine());
		
		discriminant = (Math.pow(b, 2) - (4 * a * c));
		plusAnswer = ((b * -1) + (Math.sqrt(discriminant)) / (2 * a));
		minusAnswer = ((b * -1) - (Math.sqrt(discriminant)) / (2 * a));
		
		

		System.out.println("Answer: " + round.format(plusAnswer) + " or " + round.format(minusAnswer));

	}

}
