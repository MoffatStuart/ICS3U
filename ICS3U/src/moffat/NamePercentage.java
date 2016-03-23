package moffat;

import java.util.Scanner;

public class NamePercentage {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String name;
		int percentage;
		
		percentage = (int)(Math.random() * 10);
		
		System.out.println("What is your name?");
		name = (scan.nextLine());
		
		if (percentage <= 7)
		{
			System.out.println("Wow " + name + " that is my favourite name!!");
		}
		else
		{
			System.out.println("EWW; I hate that name");  
		}
		

	}

}
