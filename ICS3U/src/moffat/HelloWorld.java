package moffat;

import java.util.Scanner;

/*mothersAge.java
 * This program prints "Hello World" to the program
 * Stuart Moffat
 * March 2nd 2016
 */
public class HelloWorld {
	
	public static void main(String[] args) {
		//This prints "Hello world" to the console.
		Scanner myInput = new Scanner(System.in);
		
		int age;
		int kidsAge;
		int ageAtBirth;
		String mothersName;
		String kidsName;
		
		System.out.println("What is your name?");
		mothersName = myInput.nextLine();
		System.out.println("What is your age?");
		age = Integer.parseInt(myInput.nextLine());
		System.out.println("What is your childs name?");
		kidsName = myInput.nextLine();
		System.out.println("How old is your kid?");
		kidsAge = Integer.parseInt(myInput.nextLine());
		ageAtBirth = age - kidsAge;
		
		if (kidsAge > age)
		{
			System.out.println("Looks like you made a mistake");			
		}
		else
		{
			System.out.println(mothersName + " was " + ageAtBirth + " years old when your child " + kidsName + " was born");
		}
		
		
				
				 
		
		
	}

}
