import java.util.Scanner;

interface IntSequenceStr {
	boolean hasNext();
	int next();
}

class BinarySequenceStr implements IntSequenceStr {
	
	private int num, seqnum;
	private int i=0, temp=0;
	
	public BinarySequenceStr(int num) {
		this.num = num;
		for(i=1;num/Math.pow(2, i)!= 0;i++) {
			temp++;
			num = num/2;
		}
	//	System.out.println("\ntemp: " + temp);
	}
	
	public boolean hasNext() {
		if(temp == 0) {
		//	System.out.println("\ntemp :" + temp); 
		//	System.out.println("num :" + num);
			return false;
		}
		else {
		//	System.out.println("\ntrue num :" + num);
			temp--;
			return true;
		}
	}
	
	public int next() {
		seqnum = (int)(num/Math.pow(2, temp));
		num = num % (int)Math.pow(2, temp);
		return seqnum;
	}
}



public class Problem07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		String str = in.nextLine();		 
		int num = Integer.parseInt(str);
		in.close();
		System.out.println("Integer: " + num);
		IntSequenceStr seq = new BinarySequenceStr(num);
		System.out.print("Binary number: ");
		while(seq.hasNext()) System.out.print(seq.next());
		System.out.println(" ");

	}

}
