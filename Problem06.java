interface IntSequence{
	boolean hasNext();
	long next();
}

class FibonacciSequence implements IntSequence{
	private int i=0;
	private long[] f = new long[300];
	//f[0] = 0;
	//f[1] = 1;
	
	public boolean hasNext() {
		return true;
	}
	public long next() {
		f[0] = 0; f[1] = 1;
		f[i+2] = f[i] + f[i+1];
		return f[i++];
	}
	
}

public class Problem06 {
	public static void main(String[] args) {
		IntSequence seq = new FibonacciSequence();
		for(int i=0; i<20; i++) {
			if(seq.hasNext() == false) break;
			System.out.print(seq.next() + " ");
		}
		System.out.println(" ");
	}

}