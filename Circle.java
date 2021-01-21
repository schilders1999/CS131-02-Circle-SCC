public class Circle {
	private double radius=0;
	
public Circle() {
	radius=1;
}

public Circle(double r) {
	radius=r;
}

public double CircleArea(double r) {
	double area=Math.PI*Math.pow(r, 2);
	return area;
}

}
