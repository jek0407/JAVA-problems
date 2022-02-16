import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ASCII code teller. Enter a letter: ");
		String s = scan.next();
		char c = s.charAt(0);
		int byteC = (byte) c;
		int sLength = s.length();
		
		if(sLength == 1) {
			if((64<byteC && byteC<91) || (96<byteC && byteC<123))
				System.out.println("The ASCII code of " + c + " is " + byteC);
			else
				System.out.println("You must input a single uppercase or lowercase alphabet.");
		}
		else
			System.out.println("You must input a single uppercase or lowercase alphabet.");
		
		
	}

}
