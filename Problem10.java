
class Points{
	private double[] points;
	public double sum = 0;
	
	public Points(double[] point) {
		this.points = point;
		
	}
	
	/*public double[] getPoints() {
		return this.points;
	}*/
	
	public double getSum() {
		for(int i = 0; i<this.points.length;i++)
			this.sum += this.points[i];
		//System.out.println("\nSum : " + sum);
		return this.sum;
	}
	
	public boolean equals(Points p) {
		if(p == null)
			return false;
		if(this.getSum() == p.getSum())
			return true;
		else
			return false;
	}
	
	public String toString() {
		return ("[sum of points: " + getSum() + "]");
	}
}	


public class Problem10 {
	public static void main(String[] args) {
		Points p1 = new Points(new double[] {1.0, 2.0, 3.0});
		Points p2 = new Points(new double[] {4.0, 5.0, 6.0});
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		Points p3 = new Points(new double[] {1.0, 4.0, 7.0});
		Points p4 = new Points(new double[] {3.0, 9.0});
		System.out.println(p3); System.out.println(p4);
		System.out.println(p3.equals(p4));
		Points p5 = new Points(new double[] {1.0, 2.0});
		Points p6 = null;
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p5.equals(p6));
	}
}