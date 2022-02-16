import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Text {
	private static String text[] = new String[999];
	private static String line = null;
	private static int temp = 0;

	public boolean readTextFromFile(String string) {
		BufferedReader br = null;
		int i = 0;
		
		try {
			br = new BufferedReader(new FileReader(string));
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found.");
			//e.printStackTrace();
			return false;
		}
	
		while(true) {
			try {
				line = br.readLine();
			} catch (IOException e) {
				System.out.println("IO Exception.");
				e.printStackTrace();
				//return false;
			}
			
			if(line == null) break;
			
			text[i++] = line;
		}

		temp = i;
		
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("File close error.");
			e.printStackTrace();
			//return false;
		}
		
		return true;
	}

	public int countChar(char c) {
		int i, j, count = 0;
		char s[];
		
		for(i=0; i<temp; i++) {
			s = text[i].toCharArray();
			for(j=0; j<text[i].length(); j++) {
				//System.out.print(s[j]);
				if(s[j] == c || s[j] == c - 32) count++;
			}
		}
		
		return count;
	}
	
}


public class Problem13 {
	public static void main(String[] args) {
		Text t = new Text(); 
		if(t.readTextFromFile("input_prob13.txt")) {
			for(char c = 'a'; c <= 'z'; c++) {
				System.out.println(c + ": " + t.countChar(c)); 
			}
		}
	}
}