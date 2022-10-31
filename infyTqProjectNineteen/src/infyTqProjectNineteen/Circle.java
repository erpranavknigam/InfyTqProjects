package infyTqProjectNineteen;

public class Circle {
	private final double PI = Math.PI;
	private double diameter;
	private double circumference;
	private double area;
	
	public Circle(double diameter) {
		this.diameter = diameter;
	}
	
	public void calculateCircumference() {
		setCircumference(getPI()*getDiameter());
	}
	
	public void calculateArea() {
		setArea(getPI()*Math.pow(getDiameter()/2.0, 2));
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPI() {
		return PI;
	}
	
	
}
