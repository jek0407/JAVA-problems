class Point{	
	private double[] dot;
	
	public Point(double[] dot) {
		this.dot = new double[dot.length];
		for(int i = 0; i<dot.length; i++)
			this.dot[i] = dot[i];
	}
	public double[] getDot() {
		return this.dot;
	}
}

class EuclideanDistance {
	private double[] dot1, dot2;
	private static double distance;
	
	public EuclideanDistance(Point p1, Point p2) {
		if(p1.getDot().length == p2.getDot().length)
		//distance = 0;
		for(int i = 0; i<3; i++)
			dot1[i] = p1.getDot()[i];
		for(int j = 0; j<3; j++)
			dot2[j] = p2.getDot()[j];
	}
	public static double getDist(Point p1, Point p2) {
		distance = 0;
		for(int i = 0; i<p1.getDot().length && i<p2.getDot().length; i++) {
			//System.out.println("\nlength: " + p1.getDot().length + "," + p2.getDot().length);
			distance += (p1.getDot()[i] - p2.getDot()[i])*(p1.getDot()[i] - p2.getDot()[i]);
		}
		if(p1.getDot().length == p2.getDot().length)
			return Math.sqrt(distance);
		else
			return -1;
	}
	
}

class ManhattanDistance {
	private double[] dot1, dot2;
	private static double distance;
	
	public void ManhattanDistacne(Point p1, Point p2) {
		//distance = 0;
		for(int i = 0; i<3; i++)
			dot1[i] = p1.getDot()[i];
		for(int j = 0; j<3; j++)
			dot2[j] = p2.getDot()[j];
	}
	public static double getDist(Point p1, Point p2) {
		distance = 0;
		for(int i = 0; i<p1.getDot().length && i<p2.getDot().length; i++) {
		//	System.out.println("\ndistanceM: " + distance);
			distance += Math.abs(p1.getDot()[i] - p2.getDot()[i]);
		}
		
		if(p1.getDot().length == p2.getDot().length)
			return distance;
		else
			return -1;
	}
}




public class Problem09 {
	public static void main(String[] args) {
		Point p1 = new Point(new double[] {1.0, 2.0, 3.0});
		Point p2 = new Point(new double[] {4.0, 5.0, 6.0});
		System.out.println("Euclidean Distance: " + EuclideanDistance.getDist(p1, p2));
		System.out.println("Manhattan Distance: " + ManhattanDistance.getDist(p1, p2));
		Point p3 = new Point(new double[] {1.0, 2.0, 3.0});
		Point p4 = new Point(new double[] {4.0, 5.0});
		System.out.println("Euclidean Distance: " + EuclideanDistance.getDist(p3, p4));
		System.out.println("Manhattan Distance: " + ManhattanDistance.getDist(p3, p4));
	}
}