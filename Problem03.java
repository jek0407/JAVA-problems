import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s;
		int count = 0, sLength;
		char letter;
		
		System.out.print("Enter a text: ");
		String text = scan.nextLine();
		int textLength = text.length();
		
		
		for(int i = 0; ; i++) {
			System.out.print("Enter a letter: ");
			s = scan.nextLine();
			sLength = s.length();
			
			if(sLength == 1)
				break;
			else
				System.out.println("You must enter a single letter.");
		}
		letter = s.charAt(0);
		
		
		for (int i = 0; i < textLength; i++) {
			if(letter == text.charAt(i))
				count++;
		}
		
		System.out.println("There are " + count + " " + letter + "'s in the text"); 
	}

}
