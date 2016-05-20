package moffat;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int primeNumber;
		int userNumber;
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Please input a whole number.");
		userNumber = scan.nextInt();
		
		for (int i = 2; i < userNumber; i++)
		{
			primeNumber = userNumber / i;
			
			for (int i1 = 2; i1 < primeNumber; i1++)
			{
				if (primeNumber == i1)
				{
					System.out.println("Not prime");
				}
				else 
				{
					System.out.println("prime");
				}
			}
		}

	}

}
