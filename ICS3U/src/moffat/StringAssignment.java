package moffat;

import java.util.Scanner;

public class StringAssignment {
	/*
	 * Stuart Moffat
	 * May 11th 2016
	 * Using arrays to play game
	 */

	public static void main(String[] args) throws InterruptedException {
	
			String guessWord;
			String [] secretWordList={"cat","brain","snail","ostrich","neck", "man", "new"};
			
			int x=(int)(Math.random()*secretWordList.length);
			Scanner scn=new Scanner (System.in);
		    String dashes="";
		    
		    System.out.println("Guess the word!");
		    
		    //Determining how many dashes to display
		    for (int i=0;i<secretWordList[x].length();i++)
		    {
		    	dashes=dashes+"-";
		    }
		    System.out.println(dashes);
		    
		    do
		    {
		    	int counter=0;
		    	System.out.println("Guess a letter.(enter ! to guess the word)");
		    	guessWord=scn.nextLine();
		    	
		    	//Determining if they are guessing whole word or just letter
		    	if (guessWord.equalsIgnoreCase("!"))
		    	{
		    		System.out.println("What is your guess?");
		    		guessWord=scn.nextLine();
		    		//Checking to see if the guess was correct
		    		if (guessWord.equalsIgnoreCase(secretWordList[x]))
		    		{
		    			System.out.println("Congratulations, you're correct!");
		    		}
		    		else
		    		{
		    			System.out.println("Wrong, try again.");
		    			System.out.println(dashes);
		    		}
		    		
		    	}
		    	else
		    	{
		    		int num = secretWordList[x].indexOf(guessWord);
		    		
		    		//Determining if the letter they guessed is present in the word
		    		if (num==-1)
		    		{
		    			System.out.println("Wrong, please guess another letter");
		    			System.out.println(dashes);
		    		}
		    		else 
		    		{
		    			//Showing user where the letter appears in the word
		    			dashes=dashes.substring(0, num)+guessWord+dashes.substring(num+1,secretWordList[x].length());
		    			System.out.println(dashes);
		    			for(int i=0;i<dashes.length();i++)
			    		{
			    			if (dashes.charAt(i)!='-')
			    			{
			    				counter++;
			    			}
			    			if (counter==secretWordList[x].length())
			    			{
			    				System.out.println("Congratulations, you guessed all the letters");
			    				guessWord=secretWordList[x];
			    			}
			    		}
		    		}
		    		
		    		
		    	}
		    	
		    	
		    }
		    while(!guessWord.equalsIgnoreCase(secretWordList[x]));
			
			
			
		
		
		
		

	}

}
