class SubsequenceChecker{
	public static void check(String string, String subString) {
		if(string == null || subString == null || string == "" || subString == "")
			System.out.println("Wrong Input!");
		else {
			int i,j=0,k=0;
			char[] s1 = string.toCharArray();
			char[] s2 = subString.toCharArray();
			int[] flag = new int[s2.length];
			for(i=0;i<string.length();i++) {
				if(s1[i] == s2[j]) { 
					j++;
					flag[k++] = i;
					if(j == subString.length()) break;
				}
			}
		
			if(j!=subString.length() && i == string.length())
				System.out.println(subString + " is not a subsequence of " + string);
			else {
				System.out.println(subString + " is a subsequence of " + string);
				for(i=0;i<k;i++)
					System.out.print(flag[i] + " ");
				System.out.println();
			}
		}
	}
}

public class Problem12 {
	public static void main(String[] args) {
		SubsequenceChecker.check("supercalifragilisticexpialidocious", "pads");
		SubsequenceChecker.check("supercalifragilisticexpialidocious", "padsx"); 
	}
}