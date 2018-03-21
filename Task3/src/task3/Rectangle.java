package task3;

public class Rectangle extends Shape {
	private double lenght;
	private int height;
	public Rectangle(double lenght, int height) {
		super();
		this.lenght = lenght;
		this.height = height;
	}
	public double area() {
		return (lenght*height);
	}
	

}
