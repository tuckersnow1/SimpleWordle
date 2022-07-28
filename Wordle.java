//imports
import java.io.*;
import java.util.*;

public class Wordle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"about","above","abuse","alert","alike","along","block","blind","badly","baker","chose","civil","cover","board","apart","after","booth","arena","mouse","party","prime","pride","print","ratio","royal","scale","scene",};
		int randWord = new Random().nextInt(words.length);
		String firstWord = words[randWord];
		System.out.println("Guess a word!");
		Scanner scan = new Scanner(System.in);
		String guess = scan.nextLine();
		if (guess.length() < 5 || guess.length() > 5){
			System.out.println("Guess a word longer or shorter than 5!");
			guess = scan.nextLine();
			int count = 0;
			readGuess(guess, firstWord, count);
		}else {
			int count = 0;
			readGuess(guess, firstWord, count);
		}
		
		
		
		
	}

	
	
	 static void readGuess(String guess, String firstWord, int count) {
		 count++;
		 if (count <6) {
		 if (!guess.equals(firstWord)) {
			 
			 for (int i =0; i < firstWord.length(); i++) {
				 if (firstWord.charAt(i) == guess.charAt(i)) {
					 
					 if (i==4) { 
						 System.out.println("Y");
						 }else {
					 	System.out.print("Y");
						 }
					 
				 }else {
					 if (i==4) { 
					 System.out.println("X");
					 }else {
					 System.out.print("X");
					 }
				 }
			 }
			 System.out.println("Guess Again!");
			  Scanner scan = new Scanner(System.in); 
			  String guessAgain = scan.nextLine();
				if (guessAgain.length() < 5 || guessAgain.length() > 5){
					System.out.println("Guess a word longer or shorter than 5!");
					guessAgain = scan.nextLine();
					readGuess(guess, firstWord, count);
				}else {
					
					readGuess(guess, firstWord, count);
				}
			 
			 
		 }else {
			 System.out.println("YYYYY");
			 if (count ==1) {
				 System.out.println("You did it in " + count + " try!");
			 }else {
			 System.out.println("You did it in " + count + " many tries!");
			 }
			 
		 }
		 }else {
			 System.out.println("All out of guesses!");
			 System.out.println("The word was " + firstWord);
		 }
		
	}
}
