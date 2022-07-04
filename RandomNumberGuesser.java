/*
 * Class: CMSC203 
 * Instructor:Grinberg
 * Description: User guesses a number between 0 and 100.
 * Due: 7/03/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Bushman
*/
import java.util.Random;
import java.util.Scanner;
/** Program that has you guess a random number between 0 and 100 */

public class RandomNumberGuesser {
	/** Main @param args */
	public static void main(String[] args)
	
	{

	Scanner sc = new Scanner(System.in);
	int randNum;
	int nextGuess;
	int highGuess = 100;
	int lowGuess = 0;
	RNG rng = new RNG();
	randNum = rng.rand();
	System.out.println("Enter a number between 0 and 100");
	nextGuess = sc.nextInt();
	String userAnswer  = sc.nextLine();

	while (nextGuess != randNum)
	{
		if ((int)rng.getCount()/2 != 0)
			System.out.println("Number of guesses is " + (int)rng.getCount()/2);
			
	while (!rng.inputValidation(nextGuess, lowGuess, highGuess))
	{
				nextGuess = sc.nextInt();
	}
	
	/** If user guess is greater than number, too high */

	if (nextGuess > randNum)
	{
		System.out.println("Your guess is too high");
		highGuess = nextGuess;
	}
	
	/** If user guess is less than number, too low */

	else if (nextGuess < randNum)
	{
		System.out.println("Your guess is too low");
		lowGuess = nextGuess;
	}
	
	/** Once guess = number, ending follows */

	if (nextGuess == randNum)
	{
		System.out.println("Congulations! You guessed correctly!");
		System.out.println("Try again? (yes or no)");
		userAnswer = sc.next();
	
	/** If no, then continue */

	if (userAnswer.equals("yes"))
	
	{
		 rng.resetCount();
		 main(args);
	
	/** If yes, then end */

	if (userAnswer.equals("no"))
	{
		System.out.println("Goodbye.");
		System.exit(0);
  }
	}
	}
	}
	}
}

	


