package moffat;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [] names = new String[1000];
		int n;
		
		System.out.println("How many names are you inputting?");
		n = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Please input a name.");
			names[i] = scan.nextLine();
		}
		
		for (int i = 0; i < n; i++)
		{
			System.out.println(names[i] + ", ");
		}
		
		for (int i = n; i <= n && i >= 0; i--)
		{
			System.out.println(names[i] + " ");
		}
		
	}

}
