import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string, text;
		int count = 0, stringLength, textLength, flag=0;
		char letter;
		
		System.out.print("Enter a text: ");
		text = scan.nextLine();
		textLength = text.length();
		
		
		for(int i = 0; ; i++) {
			System.out.print("Enter a string: ");
			string = scan.nextLine();
			stringLength = string.length();
			
			if(stringLength > 0) {
				break;
			}
			else
				System.out.println("You must enter a string.");
		}

		for(int i = 0; i<textLength-stringLength+1; i++) {
			flag = i;
			//System.out.println("for문 밖 flag:"+flag);
			for(int j = 0; j<stringLength; j++) {
				if(string.charAt(j) != text.charAt(flag)) {
				//	System.out.println("if문안, i: "+i + " j: " + j + " flag: " + flag);
					break;
				}
				else {
					flag++;
					//System.out.println("else, i: "+i + " j: " + j + " flag: " + flag);
				}
				
				if(j == stringLength-1){
					count++;
				}
			}
			
		}
		
		
		System.out.println("There are " + count + " instances of " + "\"" + string + "\"."); 
	}
}


