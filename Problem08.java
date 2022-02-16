interface Shape {
	public double area();
}

class Circle implements Shape {
	private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public double area() {
		return radius*radius*Math.PI;
	}
}

class Square implements Shape{
	private double side;
	public Square(double side){
		this.side = side;
	}
	public double area() {
		return side*side;
	}
}

class Rectangle implements Shape{
	private double num1, num2;
	public Rectangle(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public double area() {
		return num1*num2;
	}
}

public class Problem08 {
	private static double sum = 0;
//	private static int i;
	
	public static double sumArea(Shape[] arr) {

		for(int i=0;i<arr.length;i++) {
			sum += arr[i].area();
	//		System.out.println("i :" + arr[i].area());
		}
	//	System.out.println("arr[4] :" + arr[4].area());
		return sum;
	}

	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Square(4.0),
				new Rectangle(3.0, 4.0), new Square(5.0)};
		System.out.println("Total area of the shapes is: " + sumArea(arr));
	}

}
