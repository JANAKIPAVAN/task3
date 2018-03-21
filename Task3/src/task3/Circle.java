package task3;

public class Circle extends Shape{
	private int radius;
public Circle(int radius) {
	setRadius(radius);
}

public void setRadius(int radius) {
	this.radius=radius;
}

public double area() {
	return (Math.PI*this.radius*this.radius);
}

public double circumference() {
	return(2*Math.PI*this.radius);
}
}
