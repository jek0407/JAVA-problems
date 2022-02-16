class PalindromeChecker {
	
	public static void check() {
		System.out.println("Wrong Input!");
	}
	
	public static void check(String string) {
		if(string == null || string == "")
			System.out.println("Wrong Input!");
		else {
			String stringReverse;
			stringReverse = new StringBuilder(string).reverse().toString();
			if(string.equals(stringReverse)) 
				System.out.println(string + " is a palindrome.");
			else
				System.out.println(string + " is not a palindrome.");
		}
	}
	
	public static void check(int Int) {
		int num, reversed = 0, digit = 0;
		num = Int; 
		
		while(num != 0) {
			digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		
		if(reversed == Int)
			System.out.println(Int + " is a palindrome.");
		else
			System.out.println(Int + " is not a palindrome.");
	
	}
}

public class Problem11 {
	public static void main(String[] args) {
		PalindromeChecker.check("abcde"); 
		PalindromeChecker.check("abcba"); 
		PalindromeChecker.check(1234); 
		PalindromeChecker.check(12321);
	}
}