import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = (int)(101*Math.random());
		int i = 0, guess = 101, guessSmall = 0, guessLarge = 101;
		Scanner scan = new Scanner(System.in);
		
		for(i=1; ; i++) {
			
			System.out.print("[" + i + "] Guess a number (" +  (guessSmall+1) + "-" + (guessLarge-1) + "): ");
			guess = scan.nextInt();
			if(guessSmall < guess && guess < guessLarge) {
				if(guess < n) {
					System.out.println("Too small!");
					guessSmall = guess;
				}
				else if(guess > n) {
					System.out.println("Too large!");
					guessLarge = guess;
				}
				else
					break;
			}
			
			else {
				System.out.println("Not in range!");
				i--;
			}
			
				
		}
		
		System.out.println("Correct! Number of guesses: " + i);
	}

}
